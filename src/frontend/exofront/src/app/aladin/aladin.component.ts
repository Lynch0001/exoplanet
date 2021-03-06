import {Component, Input, OnInit} from '@angular/core';
declare const showAladin: any;

@Component({
  selector: 'app-aladin',
  templateUrl: './aladin.component.html',
  styleUrls: ['./aladin.component.css']
})
export class AladinComponent implements OnInit {

  @Input() aladinPlanetImport: string;

  constructor() {
  }

  ngOnInit() {
    console.log('Aladin Display called on: ' + this.aladinPlanetImport);
    showAladin(this.aladinPlanetImport);
  }
}
