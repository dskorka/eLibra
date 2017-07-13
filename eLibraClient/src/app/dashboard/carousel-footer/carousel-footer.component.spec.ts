import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarouselFooterComponent } from './carousel-footer.component';

describe('CarouselFooterComponent', () => {
  let component: CarouselFooterComponent;
  let fixture: ComponentFixture<CarouselFooterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarouselFooterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarouselFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
