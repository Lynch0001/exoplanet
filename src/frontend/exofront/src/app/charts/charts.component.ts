import {Component, Input, OnInit} from '@angular/core';
import * as d3 from 'd3';
import {RestService} from "../rest.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {

  private svg1;
  private svg2;
  private svg3;
  private margin = 50;
  private width = 750 - (this.margin * 2);
  private height = 400 - (this.margin * 2);
  planets: any = [];
  planetsFiltered: any = [];


  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    console.log("Staring Init");
    this.getPlanetData();
    this.createSvg1();
    this.createSvg2();
    this.createSvg3();
    console.log('End of init');
  }

  getPlanetData() {
    this.rest.getAllPlanets().toPromise().then((data: {}) => {
      console.log('Data Received: ' + data);
      this.planets = data;
      this.drawPlot1();
      this.drawPlot2();
      this.drawPlot3();
    });
  }

  /* *************************************************************************
   *  Create Scatter Plot 1 - Pl Size vs Distance
   * *************************************************************************
   */

  private createSvg1(): void {
    this.svg1 = d3.select("figure#scatter1")
      .append("svg")
      .attr("width", this.width + (this.margin * 2))
      .attr("height", this.height + (this.margin * 2))
      .append("g")
      .attr("transform", "translate(" + this.margin + "," + this.margin + ")");
  }


  private drawPlot1(): void {
    // Add X axis
    const x = d3.scaleLinear()
      .domain([0, 9000])
      .range([0, this.width]);
    this.svg1.append("g")
      .attr("transform", "translate(0," + this.height + ")")
      .call(d3.axisBottom(x).tickFormat(d3.format("d")));

    // Add Y axis
    const y = d3.scaleLinear()
      .domain([0, 26])
      .range([this.height, 0]);
    this.svg1.append("g")
      .call(d3.axisLeft(y));

    // Filter data

    this.planetsFiltered = this.planets
      .filter(d => d.pl_rade != null && d.pl_rade > 0 && d.pl_rade < 30 &&
        d.sy_dist != null && d.sy_dist > 0
      );

    // Add dots
    console.log("Data at addDots method: " + this.planets.type);
    const dots = this.svg1.append('g');

    dots.selectAll("dot")
      .data(this.planetsFiltered)
      .enter()
      .append("circle")
      .attr("cx", d => x(d.sy_dist))
      .attr("cy", d => y(d.pl_rade))
      .attr("r", 3)
      .style("fill", function (d) {
        switch (d.discoverymethod) {
          case 'Radial Velocity':
            return '#E90039';
            break;
          case 'Transit':
            return '#69b3a2';
            break;
          case 'Microlensing':
            return '#0784BA';
            break;
          case 'Imaging':
            return '#000000';
            break;
          default:
            return '#7A7A7A';
        }
      });

    // Axis Labels
    d3.select("svg")
      .append("text")
      .text("Planet Radius [R(e)]")
      .attr("transform", "translate(0," + (this.height / 2) + ") rotate(90)")
      .attr("class", "y-axis1");


    d3.select("svg")
      .append("text")
      .attr("class", "x-axis1")
      .text("Distance (pc)")
      .attr("transform", "translate(" + (this.width / 2 + this.margin) + "," + (this.height + this.margin * 2 - 10) + ")");



    // Plot 1 legend


    let dataset = [
      {label: 'Imaging', color: '#000000'},
      {label: 'Transit', color: '#69b3a2'},
      {label: 'Microlensing', color: '#0784BA'},
      {label: 'Radial Velocity', color: '#E90039'},
      {label: 'Other', color: '#7A7A7A'}
    ];

    var legendRectSize = 14;
    var legendSpacing = 3;

    var legend = this.svg1.selectAll('.legend')
      .data(dataset)
      .enter()
      .append('g')
      .attr('class', 'legend')
      .attr('transform', function(d, i) {                     // NEW
        var height = legendRectSize + legendSpacing;
        var offset = 20;
        var horz = 500;
        var vert = i * height - offset;
        return 'translate(' + horz + ',' + vert + ')';
      });

    legend.append('rect')
      .attr('width', legendRectSize)
      .attr('height', legendRectSize)
      .style('fill', function (d) {
        return d.color;
      })
      .style('stroke', 'grey');

    legend.append('text')
      .attr('x', legendRectSize + legendSpacing)
      .attr('y', legendRectSize - legendSpacing)
      .text(function (d) {
        return d.label;
      });

  }
  /* *************************************************************************
   *  Create Scatter Plot 2 - St Lum vs St Mass
   * *************************************************************************
  */

  private createSvg2(): void {
    this.svg2 = d3.select("figure#scatter2")
      .append("svg")
      .attr("width", this.width + (this.margin * 2))
      .attr("height", this.height + (this.margin * 2))
      .append("g")
      .attr("transform", "translate(" + this.margin + "," + this.margin + ")");
  }


  private drawPlot2(): void {
    // Add X axis
    const x2 = d3.scaleLinear()
      .domain([0,15])
      .range([ 0, this.width ]);
    this.svg2.append("g")
      .attr("transform", "translate(0," + this.height + ")")
      .call(d3.axisBottom(x2).tickFormat(d3.format("d")));

    // Add Y axis
    const y2 = d3.scaleLinear()
      .domain([-8, 5])
      .range([ this.height, 0]);
    this.svg2.append("g")
      .call(d3.axisLeft(y2));

    // Filter data

    this.planetsFiltered = this.planets
      .filter( d => d.st_lum != null || d.st_lum != '' &&
        d.st_mass != null || d.st_mass > 0

      );

    // Add dots
    console.log("Data at addDots method: " + this.planets.type);
    const dots = this.svg2.append('g');
    dots.selectAll("dot")
      .data(this.planetsFiltered)
      .enter()
      .append("circle")
      .attr("cx", d => x2(d.st_mass))
      .attr("cy", d => y2(d.st_lum))
      .attr("r", 3)
      .style("opacity", 1)
      .style("fill", "#69b3a2");


    // Axis Labels

      this.svg2.append("text")
      .attr("class", "y-axis2")
      .text("Stellar Luminosity")
      .attr("transform","translate(" + -this.margin + "," + (this.height/2-this.margin) + ") rotate(90)");


      this.svg2.append("text")
      .attr("class", "x-axis2")
      .text("Stellar Mass [m(s)]")
      .attr("transform","translate(" + (this.width/2-this.margin) + "," + (this.height+this.margin) + ")");
  }

  /* *************************************************************************
     *  Create Scatter Plot 3 - St Size vs Pl Size
     * *************************************************************************
    */

  private createSvg3(): void {
    this.svg3 = d3.select("figure#scatter3")
      .append("svg")
      .attr("width", this.width + (this.margin * 2))
      .attr("height", this.height + (this.margin * 2))
      .append("g")
      .attr("transform", "translate(" + this.margin + "," + this.margin + ")");
  }

  private drawPlot3(): void {
    // Add X axis
    const x = d3.scaleLinear()
      .domain([0,85])
      .range([ 0, this.width ]);
    this.svg3.append("g")
      .attr("transform", "translate(0," + this.height + ")")
      .call(d3.axisBottom(x).tickFormat(d3.format("d")));

    // Add Y axis
    const y = d3.scaleLinear()
      .domain([0, 35])
      .range([ this.height, 0]);
    this.svg3.append("g")
      .call(d3.axisLeft(y));

    // Filter data

    this.planetsFiltered = this.planets
      .filter( d => d.st_rad != null && d.st_rad != '' &&
        d.pl_rade != null && d.pl_rade > 0

      );

    // Add dots
    console.log("Data at addDots method: " + this.planets.type);
    const dots = this.svg3.append('g');
    dots.selectAll("dot")
      .data(this.planetsFiltered)
      .enter()
      .append("circle")
      .attr("cx", d => x(d.st_rad))
      .attr("cy", d => y(d.pl_rade))
      .attr("r", 3)
      .style("opacity", 1)
      .style("fill", "#69b3a2");


    // Axis Labels

      this.svg3.append("text")
      .text("Planet Radius [r(e)]")
      .attr("transform","translate(" + -this.margin + "," + (this.height/2-this.margin) + ") rotate(90)")
      .attr("class", "y-axis3");

      this.svg3.append("text")
      .attr("class", "x-axis3")
      .text("Stellar Radius [r(sun)]")
      .attr("transform","translate(" + (this.width/2-this.margin) + "," + (this.height+this.margin) + ")");

  }

}
