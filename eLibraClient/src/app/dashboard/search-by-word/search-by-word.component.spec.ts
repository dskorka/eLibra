import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchByWordComponent } from './search-by-word.component';

describe('SearchByWordComponent', () => {
  let component: SearchByWordComponent;
  let fixture: ComponentFixture<SearchByWordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchByWordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchByWordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
