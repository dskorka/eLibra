import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibraryAddressDataComponent } from './library-address-data.component';

describe('LibraryAddressDataComponent', () => {
  let component: LibraryAddressDataComponent;
  let fixture: ComponentFixture<LibraryAddressDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibraryAddressDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibraryAddressDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
