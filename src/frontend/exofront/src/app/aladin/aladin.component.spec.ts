import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AladinComponent } from './aladin.component';

describe('AladinComponent', () => {
  let component: AladinComponent;
  let fixture: ComponentFixture<AladinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AladinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AladinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
