import { TestBed, inject } from '@angular/core/testing';

import { LibraryAddressDataService } from './library-address-data.service';

describe('LibraryAddressDataService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LibraryAddressDataService]
    });
  });

  it('should be created', inject([LibraryAddressDataService], (service: LibraryAddressDataService) => {
    expect(service).toBeTruthy();
  }));
});
