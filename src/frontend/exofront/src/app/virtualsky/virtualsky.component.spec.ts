import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VirtualskyComponent } from './virtualsky.component';

describe('VirtualskyComponent', () => {
  let component: VirtualskyComponent;
  let fixture: ComponentFixture<VirtualskyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VirtualskyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VirtualskyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
