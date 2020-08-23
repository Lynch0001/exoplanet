import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SizeCompareComponent } from './size-compare.component';

describe('SizeCompareComponent', () => {
  let component: SizeCompareComponent;
  let fixture: ComponentFixture<SizeCompareComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SizeCompareComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SizeCompareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
