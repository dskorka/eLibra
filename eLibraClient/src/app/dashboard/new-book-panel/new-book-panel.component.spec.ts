import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewBookPanelComponent } from './new-book-panel.component';

describe('NewBookPanelComponent', () => {
  let component: NewBookPanelComponent;
  let fixture: ComponentFixture<NewBookPanelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewBookPanelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewBookPanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
