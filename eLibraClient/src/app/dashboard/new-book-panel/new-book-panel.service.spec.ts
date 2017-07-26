import { TestBed, inject } from '@angular/core/testing';

import { NewBookPanelService } from './new-book-panel.service';

describe('NewBookPanelService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NewBookPanelService]
    });
  });

  it('should be created', inject([NewBookPanelService], (service: NewBookPanelService) => {
    expect(service).toBeTruthy();
  }));
});
