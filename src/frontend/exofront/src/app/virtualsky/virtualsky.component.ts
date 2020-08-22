import {Component, Input, OnInit} from '@angular/core';
declare const showVirtualSky: any;

@Component({
  selector: 'app-virtualsky',
  templateUrl: './virtualsky.component.html',
  styleUrls: ['./virtualsky.component.css']
})
export class VirtualskyComponent implements OnInit {

  @Input() raImport: number;
  @Input() decImport: number;
  @Input() nameImport: string;

  constructor() { }

  ngOnInit() {
    console.log('SkyView Display called for: test');
    showVirtualSky(this.raImport, this.decImport, this.nameImport);
  }

}
