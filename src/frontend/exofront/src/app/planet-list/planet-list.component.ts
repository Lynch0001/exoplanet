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
  @Input() records: number =0;

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getPlanets();
  }
  getPlanets(){
    this.planets = [];
    this.rest.getPlanets().subscribe((data: {}) => {
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


}
