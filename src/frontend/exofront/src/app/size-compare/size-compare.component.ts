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
    const spec = specType.charAt(0);
    console.log('spectype' + specType);
    console.log('spec' + spec);

    switch(spec) {
      case 'T':
        color = '#a85d23';
        return color;
        break;
      case 'L':
        color = '#e03719';
        return color;
        break;
      case 'M':
        color = '#fc8003';
        return color;
        break;
      case 'K':
        color = '#fcca03';
        return color;
        break;
      case 'G':
        color = '#fcfb8b';
        return color;
        break;
      case 'F':
        color = '#f5f4bc';
        return color;
        break;
      case 'A':
        color = '#a1cbf0';
        return color;
        break;
      case 'B':
        color = '#91baf2';
        return color;
        break;
      case 'O':
        color = '#91a0f2';
        return color;
        break;
      default:
        color = 'grey';
        return color;
    }
  }



    showPlanetSizeCompare(){
      if(this.rade==null) {

        const svg = d3.select('.planet-compare'),
          width = + svg.attr('width'),
          height = +svg.attr('height'),
          g = svg.append('text').text('No radius data available.').attr('transform', 'translate(' + (width/2 - 50) + ',' + height / 2 + ')');

      }else if (this.rade < 1){

        this.rEarth=10;
        this.factor=10;
        this.drawSmallerComparison();

      }else if (this.rade >= 1 && this.rade < 3){

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

      }else{

        this.rEarth=4;
        this.factor=.5;
        this.drawLargerComparison();

      }
    }

    drawSmallerComparison(){
      // size earth for foreground
      const arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size comparison planet for background
      const arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      const svg = d3.select('.planet-compare'),
        width = + svg.attr('width'),
        height = +svg.attr('height'),
        g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

      // Add the earth in blue
      const background = g.append('path')
        .datum({endAngle: 3.14})
        .style('fill', 'rgb(66, 182, 245)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc1);

      // Add the comparison planet in green
      const foreground = g.append('path')
        .datum({endAngle: -3.14})
        .style('fill', 'rgb(62, 156, 72)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc2);
    }


    drawLargerComparison(){
      // size comparison planet for background
      const arc1 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.rade * this.factor)
        .startAngle(0);

      // size earth for foreground
      const arc2 = d3.arc()
        .innerRadius(0)
        .outerRadius(this.rEarth * this.factor)
        .startAngle(0);

      const svg = d3.select('.planet-compare'),
        width = + svg.attr('width'),
        height = +svg.attr('height'),
        g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

      // Add the comparison on right in green
      const background = g.append('path')
        .datum({endAngle: -3.14})
        .style('fill', 'rgb(62, 156, 72)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc1);

      // Add the earth on left in blue
      const foreground = g.append('path')
        .datum({endAngle: 3.14})
        .style('fill', 'rgb(66, 182, 245)')
        .style('stroke', 'rgb(0, 0, 0)')
        .attr('stroke-width', 1)
        .attr('d', arc2);
    }


   // Star Comparison



  showStarSizeCompare(color){
    if(this.rads==null) {

      const svg = d3.select('.star-compare'),
        width = + svg.attr('width'),
        height = + svg.attr('height'),
        g = svg.append('text').text('No radius data available.').attr('transform', 'translate(' + (width/2 - 50) + ',' + height / 2 + ')');

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
    const arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size the Sun
    const arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    const svg2 = d3.select('.star-compare'),
      width = + svg2.attr('width'),
      height = +svg2.attr('height'),
      g2 = svg2.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');

    // Add the Sun in white
    const background = g2.append('path')
      .datum({endAngle: 3.14})
      .style('fill', '#fcfb8b')
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc3);

    // Add the Comparison star in Red
    const foreground2 = g2.append('path')
      .datum({endAngle: -3.14})
      .style('fill', color)
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc4);
  }


  drawLargerStarComparison(color){
    // size comparison planet for background
    const arc3 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.rads * this.factor)
      .startAngle(0);

    // size earth for foreground
    const arc4 = d3.arc()
      .innerRadius(0)
      .outerRadius(this.rSun * this.factor)
      .startAngle(0);

    const svg = d3.select('.star-compare'),
      width = + svg.attr('width'),
      height = +svg.attr('height'),
      g = svg.append('g').attr('transform', 'translate(' + width /2 + ',' + height / 2 + ') rotate(180)');


    // Add comparison star on right red
    const background = g.append('path')
      .datum({endAngle: -3.14})
      .style('fill', color)
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc3);

    // Add sun on left in white
    const foreground = g.append('path')
      .datum({endAngle: 3.14})
      .style('fill', '#fcfb8b')
      .style('stroke', 'rgb(0, 0, 0)')
      .attr('stroke-width', 1)
      .attr('d', arc4);



  }




}
