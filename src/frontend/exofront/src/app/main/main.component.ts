import { Component, OnInit } from '@angular/core';
import {RestService} from "../rest.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router)  { }

  ngOnInit() {
  }

}
