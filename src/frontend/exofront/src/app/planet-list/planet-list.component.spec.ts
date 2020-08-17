import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanetListComponent } from './planet-list.component';

describe('PlanetListComponent', () => {
  let component: PlanetListComponent;
  let fixture: ComponentFixture<PlanetListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlanetListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlanetListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
