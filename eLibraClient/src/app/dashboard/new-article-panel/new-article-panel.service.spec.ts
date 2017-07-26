import { TestBed, inject } from '@angular/core/testing';

import { NewArticlePanelService } from './new-article-panel.service';

describe('NewArticlePanelService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NewArticlePanelService]
    });
  });

  it('should be created', inject([NewArticlePanelService], (service: NewArticlePanelService) => {
    expect(service).toBeTruthy();
  }));
});
