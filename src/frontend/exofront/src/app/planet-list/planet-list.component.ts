import {Component, Input, OnInit} from '@angular/core';
import {RestService} from "../rest.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-planet-list',
  templateUrl: './planet-list.component.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent implements OnInit {

  planets: any = [];
  itemsPerPage: 5;
  currentPage: number;
  @Input() records: number =0;
  page: number = 0;

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

  getQuery(id){
    this.planets = [];
    this.rest.getQuery(id).subscribe((data: {}) => {
      console.log(data);
      this.planets = data;
      this.records = this.planets.length
      console.log(this.planets.length);
    });
  }

  pageChanged(event){
    console.log(this.page, event); // old page & new page
    this.page = event;
    this.getPlanets(this.page-1);
  }
}
