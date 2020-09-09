import {Component, Input, OnInit} from '@angular/core';
import * as d3 from 'd3';

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
  @Input() specType: string;
  rEarth: number;
  rSun: number;
  factor: number;
  starColor: string;

  constructor() { }

  ngOnInit() {

    this.showPlanetSizeCompare();
    console.log('spectype from PlanetDetail Component: ' + this.specType);
    this.starColor = this.getStarColor(this.specType);
    console.log('color from getStarColor: ' + this.starColor);
    this.showStarSizeCompare(this.starColor);

  }

  getStarColor(specType){
    let color: string;
    let spec = specType.charAt(0);
    console.log('spectype' + specType);
    console.log('spec' + spec);

    switch(spec) {
      case 'T':
        color = 'red';
        return color;
        break;
      case 'L':
        color = 'brown';
        return color;
        break;
      case 'M':
        color = 'orange';
        return color;
        break;
      case 'K':
        color = 'yellow';
        return color;
        break;
      case 'G':
        color = 'white';
        return color;
        break;
      case 'F':
        color = 'white';
        return color;
        break;
      case 'A':
        color = 'rgb(71, 216, 252)';
        return color;
        break;
      case 'B':
        color = 'rgb(87, 128, 230)';
        return color;
        break;
      case 'O':
        color = 'blue';
        return color;
        break;
      default:
        color = 'grey';
        return color;
    }
  }



    showPlanetSizeCompare(){
      if(this.rade==null) {

        // TODO Add Line of text indicating planet radius not available

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
      let arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size comparison planet for background
      let arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      let svg = d3.select('.planet-compare'),
        width = + svg.attr('width'),
        height = +svg.attr('height'),
        g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

      // Add the earth in blue
      let background = g.append('path')
        .datum({endAngle: 3.14})
        .style('fill', 'rgb(66, 182, 245)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc1);

      // Add the comparison planet in green
      let foreground = g.append('path')
        .datum({endAngle: -3.14})
        .style('fill', 'rgb(62, 156, 72)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc2);
    }


    drawLargerComparison(){
      // size comparison planet for background
      let arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size earth for foreground
      let arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      let svg = d3.select('.planet-compare'),
        width = + svg.attr('width'),
        height = +svg.attr('height'),
        g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

      // Add the comparison on right in green
      let background = g.append('path')
        .datum({endAngle: -3.14})
        .style('fill', 'rgb(62, 156, 72)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc1);

      // Add the earth on left in blue
      let foreground = g.append('path')
        .datum({endAngle: 3.14})
        .style('fill', 'rgb(66, 182, 245)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc2);
    }


   // Star Comparison



  showStarSizeCompare(color){
    if(this.rads==null) {

      // TODO Add Line of text indicating star radius not available

    }else if (this.rads < 1){ // TODO display smaller planet in front of Earth

      this.rSun=10;
      this.factor=10;
      this.drawSmallerStarComparison(color);

    }else if (this.rads >= 1 && this.rads < 3){ // TODO check breakpoints

      this.rSun=7;
      this.factor=5;
      this.drawLargerStarComparison(color);

    }else if (this.rads >= 3 && this.rads < 5){

      this.rSun=6;
      this.factor=4;
      this.drawLargerStarComparison(color);

    }else if (this.rads >= 5 && this.rads < 10){

      this.rSun=5;
      this.factor=2;
      this.drawLargerStarComparison(color);

    }else if (this.rads >= 10 && this.rads < 30){

      this.rSun=5;
      this.factor=1;
      this.drawLargerStarComparison(color);

    }else{

      this.rSun=4;
      this.factor=.5;
      this.drawLargerStarComparison(color);

    }
  }

  drawSmallerStarComparison(color){
    // size comparison star
    let arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size the Sun
    let arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    let svg2 = d3.select('.star-compare'),
      width = + svg2.attr('width'),
      height = +svg2.attr('height'),
      g2 = svg2.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

    // Add the Sun in white
    let background = g2.append('path')
      .datum({endAngle: 3.14})
      .style('fill', 'white')
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc3);

    // Add the Comparison star in Red
    let foreground2 = g2.append('path')
      .datum({endAngle: -3.14})
      .style('fill', color)
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc4);
  }


  drawLargerStarComparison(color){
    // size comparison planet for background
    let arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size earth for foreground
    let arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    let svg = d3.select('.star-compare'),
      width = + svg.attr('width'),
      height = +svg.attr('height'),
      g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');


    // Add comparison star on right red
    let background = g.append('path')
      .datum({endAngle: -3.14})
      .style('fill', color)
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc3);

    // Add sun on left in white
    let foreground = g.append('path')
      .datum({endAngle: 3.14})
      .style('fill', 'white')
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc4);



  }




}
