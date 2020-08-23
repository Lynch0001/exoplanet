import {Component, Input, OnInit} from '@angular/core';
import * as d3 from "d3";

@Component({
  selector: 'app-size-compare',
  templateUrl: './size-compare.component.html',
  styleUrls: ['./size-compare.component.css']
})
export class SizeCompareComponent implements OnInit {

  @Input() rade: number;
  @Input() name: string;
  @Input() rads: number;
  @Input() hostname: string;
  rEarth: number;
  rSun: number;
  factor: number;

  constructor() { }

  ngOnInit() {

    this.showPlanetSizeCompare();
    this.showStarSizeCompare();

  }


    showPlanetSizeCompare(){
      if(this.rade==null) {


      }else if (this.rade < 1){ // TODO display smaller planet in front of Earth

        this.rEarth=10;
        this.factor=10;
        this.drawSmallerComparison();

      }else if (this.rade >= 1 && this.rade < 3){ // TODO check breakpoints

        this.rEarth=7;
        this.factor=5;
        this.drawLargerComparison();

      }else if (this.rade >= 3 && this.rade < 5){

        this.rEarth=6;
        this.factor=4;
        this.drawLargerComparison();

      }else if (this.rade >= 5 && this.rade < 10){

        this.rEarth=5;
        this.factor=2;
        this.drawLargerComparison();

      }else if (this.rade >= 10 && this.rade < 30){

        this.rEarth=5;
        this.factor=1;
        this.drawLargerComparison();

      }else{                                   // TODO HD100546 77+

        this.rEarth=4;
        this.factor=.5;
        this.drawLargerComparison();

      }
    }

    drawSmallerComparison(){
      // size earth for foreground
      var arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size comparison planet for background
      var arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      var svg = d3.select(".planet-compare"),
        width = + svg.attr("width"),
        height = +svg.attr("height"),
        g = svg.append("g").attr("transform", "translate(" + width /2 + "," + height / 2 + ")");

      // Add the comparison planet in foreground in grey
      var background = g.append("path")
        .datum({endAngle: 3.14})
        .style("fill", "white")
        .attr("d", arc1);

      // Add the earth in background in white
      var foreground = g.append("path")
        .datum({endAngle: 3.14})
        .style("fill", "grey")
        .attr("d", arc2);
    }


    drawLargerComparison(){
      // size comparison planet for background
      var arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size earth for foreground
      var arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      var svg = d3.select(".planet-compare"),
        width = + svg.attr("width"),
        height = +svg.attr("height"),
        g = svg.append("g").attr("transform", "translate(" + width /2 + "," + height / 2 + ")");

      // Add the comparison planet in background in grey
      var background = g.append("path")
        .datum({endAngle: 3.14})
        .style("fill", "grey")
        .attr("d", arc1);

      // Add the earth in foreground in white
      var foreground = g.append("path")
        .datum({endAngle: 3.14})
        .style("fill", "white")
        .attr("d", arc2);
    }


   // Star Comparison



  showStarSizeCompare(){
    if(this.rads==null) {


    }else if (this.rads < 1){ // TODO display smaller planet in front of Earth

      this.rSun=10;
      this.factor=10;
      this.drawSmallerStarComparison();

    }else if (this.rads >= 1 && this.rads < 3){ // TODO check breakpoints

      this.rSun=7;
      this.factor=5;
      this.drawLargerStarComparison();

    }else if (this.rads >= 3 && this.rads < 5){

      this.rSun=6;
      this.factor=4;
      this.drawLargerStarComparison();

    }else if (this.rads >= 5 && this.rads < 10){

      this.rSun=5;
      this.factor=2;
      this.drawLargerStarComparison();

    }else if (this.rads >= 10 && this.rads < 30){

      this.rSun=5;
      this.factor=1;
      this.drawLargerStarComparison();

    }else{

      this.rSun=4;
      this.factor=.5;
      this.drawLargerStarComparison();

    }
  }

  drawSmallerStarComparison(){
    // size earth for foreground
    var arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size comparison planet for background
    var arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    var svg2 = d3.select(".star-compare"),
      width = + svg2.attr("width"),
      height = +svg2.attr("height"),
      g2 = svg2.append("g").attr("transform", "translate(" + width /2 + "," + height / 2 + ")");

    // Add the comparison planet in foreground in grey
    var background = g2.append("path")
      .datum({endAngle: 3.14})
      .style("fill", "white")
      .attr("d", arc3);

    // Add the earth in background in white
    var foreground2 = g2.append("path")
      .datum({endAngle: 3.14})
      .style("fill", "grey")
      .attr("d", arc4);
  }


  drawLargerStarComparison(){
    // size comparison planet for background
    var arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size earth for foreground
    var arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    var svg = d3.select(".star-compare"),
      width = + svg.attr("width"),
      height = +svg.attr("height"),
      g = svg.append("g").attr("transform", "translate(" + width /2 + "," + height / 2 + ")");

    // Add the comparison planet in background in grey
    var background = g.append("path")
      .datum({endAngle: 3.14})
      .style("fill", "grey")
      .attr("d", arc3);

    // Add the earth in foreground in white
    var foreground = g.append("path")
      .datum({endAngle: 3.14})
      .style("fill", "white")
      .attr("d", arc4);
  }




}
