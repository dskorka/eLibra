import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewArticlePanelComponent } from './new-article-panel.component';

describe('NewArticlePanelComponent', () => {
  let component: NewArticlePanelComponent;
  let fixture: ComponentFixture<NewArticlePanelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewArticlePanelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewArticlePanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
