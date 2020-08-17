import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Route, Router} from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }



  goToList(){
    this.router.navigate(['api/planets']);
  }

  goToCharts(){
    this.router.navigate(['api/charts']);
  }

  goToDetails(){
    this.router.navigate(['api/planet/', 1]);
  }


}
