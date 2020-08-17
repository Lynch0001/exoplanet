import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute, NavigationEnd, Router} from "@angular/router";
import {RestService} from "../rest.service";
import * as d3 from "d3";
import {validateConstructorDependencies} from "@angular/compiler-cli/src/ngtsc/annotations/src/util";


@Component({
  selector: 'app-planet-detail',
  templateUrl: './planet-detail.component.html',
  styleUrls: ['./planet-detail.component.css']
})
export class PlanetDetailComponent implements OnInit, OnDestroy {

  mySubscription: any;
  rowId: String;
  nextId: String;
  previousId: String;
  planet: any;
  aladinPlanetExport: String;

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) {

    this.router.routeReuseStrategy.shouldReuseRoute = function () {
      return false;
    };
    this.mySubscription = this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        // Trick the Router into believing it's last link wasn't previously loaded
        this.router.navigated = false;
      }
    });
  }

  ngOnInit() {

    const rowId: string = this.route.snapshot.params.id;

    this.rest.getPlanet(this.route.snapshot.params['id']).subscribe((data: {}) => {
      console.log('Fetching Planet data');
      console.log(data);
      this.planet = data;

      this.showPlanetSizeCompare(this.planet.pl_rade)

    });

    this.aladinPlanetExport = this.planet.pl_hostname;
    console.log('Aladin Export Assigned: ' + this.aladinPlanetExport);


  }
  showPlanetSizeCompare(rade: number){
    if(rade==null) {
      d3.select("svg")
        .append("circle")
        .attr("cx", "25")
        .attr("cy", "200")
        .attr("r", "10");

      d3.select("svg")
        .append("text")
        .attr("x", "350")
        .attr("y", "200")
        .attr("font-family", "Arial")
        .attr("font-size", "10")
        .text("No Data");
    }else if (rade<5){
      d3.select("svg")
        .append("circle")
        .attr("cx", "25")
        .attr("cy", "200")
        .attr("r", "10");
      d3.select("svg")
        .append("circle")
        .attr("cx", "350")
        .attr("cy", "200")
        .attr("r", rade * 10);
    }else{
      d3.select("svg")
        .append("circle")
        .attr("cx", "25")
        .attr("cy", "200")
        .attr("r", "2");
      d3.select("svg")
        .append("circle")
        .attr("cx", "350")
        .attr("cy", "200")
        .attr("r", rade * 2);
    }
  }

  getNextId(id:number){
    console.log(typeof id);
    console.log('id: ' + id);


    if(id<4154) {  // TODO compare against variable - DB Size
      this.nextId = String((id) + 1);
    }
    else{ this.nextId = String(id);}


    console.log(typeof this.nextId);
    console.log('nextId: ' + this.nextId);
    this.router.navigate(['/api/planet/', this.nextId]);
  }

  getPreviousId(id:number){
    console.log(typeof id);
    console.log('id: ' + id);

    if(id>1) {
      this.previousId = String((id) - 1);
    }
    else{ this.previousId = String(id);}

    console.log(typeof this.previousId);
    console.log('previousId: ' + this.previousId);
    this.router.navigate(['/api/planet/', this.previousId]);
  }

  ngOnDestroy() {
    if (this.mySubscription) {
      this.mySubscription.unsubscribe();
    }
  }
}

