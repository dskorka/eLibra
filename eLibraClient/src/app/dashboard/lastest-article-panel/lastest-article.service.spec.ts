import { TestBed, inject } from '@angular/core/testing';

import { LastestArticleService } from './lastest-article.service';

describe('LastestArticleService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LastestArticleService]
    });
  });

  it('should be created', inject([LastestArticleService], (service: LastestArticleService) => {
    expect(service).toBeTruthy();
  }));
});
