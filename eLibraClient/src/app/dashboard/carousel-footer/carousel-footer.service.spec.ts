import { TestBed, inject } from '@angular/core/testing';

import { CarouselFooterService } from './carousel-footer.service';

describe('CarouselFooterService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CarouselFooterService]
    });
  });

  it('should be created', inject([CarouselFooterService], (service: CarouselFooterService) => {
    expect(service).toBeTruthy();
  }));
});
