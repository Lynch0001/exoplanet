import {Component, Input, OnInit} from '@angular/core';
import {RestService} from '../rest.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-planet-list',
  templateUrl: './planet-list.component.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent implements OnInit {

  planet: any;
  planets: any = [];
  itemsPerPage: 5;
  star_desc: string;
  currentPage: number;
  @Input() startsWith: string;
  @Input() nameContains: string;
  @Input() records = 0;
  page = 0;

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) {

  }

  ngOnInit() {
    this.getPlanets(this.page);
  }
  getPlanets(page){
    this.planets = [];
    this.rest.getPlanets(page).subscribe((data: {}) => {
      console.log(data);
      this.planets = data;
      this.records = this.planets.length
      console.log(this.records);
    });
  }

  getPlanetsStartingWith(startsWith: string){
    this.router.navigate(['api/planets']);
    this.planets = [];
    let pageS = 0;
    this.rest.getPlanetsStartingWith(startsWith, pageS).subscribe((data: {}) => {
      console.log(data);
      this.planets = data;
      this.records = this.planets.length
      console.log(this.records);
    });
  }

  getPlanetsNamesContaining(nameContains: string){
    this.planets = [];
    let pageC = 0;
    this.rest.getPlanetsNamesContaining(nameContains, pageC).subscribe((data: {}) => {
      console.log(data);
      this.planets = data;
      this.records = this.planets.length
      console.log(this.records);
    });
  }

  getQuery(id){
    this.planets = [];
    this.rest.getQuery(id).subscribe((data: {}) => {
      console.log(data);
      this.planets = data;
      this.records = this.planets.length
      console.log(this.planets.length);
    });
  }

  getGravity(planet:any):number{
    return planet.pl_bmasse/(planet.pl_rade * planet.pl_rade);
  }

  getStarType(spectype:string):string{
    let star_desc:string = '';
    console.log(spectype);
    switch(spectype.substr(0,1)){
      case 'T':
        star_desc = 'Cool Brown'
        break;
      case 'L':
        star_desc = 'Cool Red'
        break;
      case 'M':
        star_desc = 'Orange Red'
        break;
      case 'K':
        star_desc = 'Light Orange'
        break;
      case 'G':
        star_desc = 'Yellow'
        break;
      case 'F':
        star_desc = 'Yellow White'
        break;
      case 'A':
        star_desc = 'White'
        break;
      case 'B':
        star_desc = 'Blue White'
        break;
      case 'O':
        star_desc = 'Blue'
        break;
    }

    if (spectype.includes('VII')) {
      star_desc = 'White Dwarf'
    } else if (spectype.includes('VI')) {
      star_desc = star_desc + ' Sub Dwarf'
    } else if (spectype.includes('V')) {
      star_desc = star_desc + ' Dwarf'
    } else if (spectype.includes('IV')) {
      star_desc = star_desc + ' Sub Giant'
    } else if (spectype.includes('III')) {
      star_desc = star_desc + ' Giant'
    } else if (spectype.includes('II')) {
      star_desc = star_desc + ' Bright Giant'
    } else if (spectype.includes('I')) {
      star_desc = star_desc + ' Super Giant'
    } else {
      star_desc = star_desc + ' Star'
    }
    console.log(star_desc);
    return star_desc;
  }

  pageChanged(event){
    console.log(this.page, event); // old page & new page
    this.page = event;
    this.getPlanets(this.page-1);
  }

}
