import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute, NavigationEnd, Router} from '@angular/router';
import {RestService} from '../rest.service';


@Component({
  selector: 'app-planet-detail',
  templateUrl: './planet-detail.component.html',
  styleUrls: ['./planet-detail.component.css']
})
export class PlanetDetailComponent implements OnInit, OnDestroy {

  mySubscription: any;
  rowId: string;
  nextId: string;
  previousId: string;
  planet: any;
  aladinPlanetExport: string;

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

    this.rest.getPlanet(this.route.snapshot.params['id']).subscribe((data: {}) => {
      console.log('Fetching Planet data');
      console.log(data);
      this.planet = data;
    }) ;

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

