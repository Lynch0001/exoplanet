import {Component, Input, OnInit} from '@angular/core';
declare const showAladin: any;

@Component({
  selector: 'app-aladin',
  templateUrl: './aladin.component.html',
  styleUrls: ['./aladin.component.css']
})
export class AladinComponent implements OnInit {

  @Input() aladinPlanetImport: String;

  constructor() {
  }

  ngOnInit() {
    console.log('Aladin Display called on: ' + this.aladinPlanetImport);
    showAladin(this.aladinPlanetImport);
/*
    $('input[name=survey]').change(function() {
      aladin.setImageSurvey($(this).val());
    });
 */
  }
}
