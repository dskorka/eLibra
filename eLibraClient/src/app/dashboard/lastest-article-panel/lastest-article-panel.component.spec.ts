import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LastestArticlePanelComponent } from './lastest-article-panel.component';

describe('LastestArticlePanelComponent', () => {
  let component: LastestArticlePanelComponent;
  let fixture: ComponentFixture<LastestArticlePanelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LastestArticlePanelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LastestArticlePanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
