import { Component, OnInit } from '@angular/core';
import {LibraryAddressDataService} from './library-address-data.service'

@Component({
  selector: 'app-library-address-data',
  templateUrl: './library-address-data.component.html',
  styleUrls: ['./library-address-data.component.css']
})
export class LibraryAddressDataComponent implements OnInit {

  departmentLibrary={};

  constructor(private libraryAddressDataService: LibraryAddressDataService) {
    this.departmentLibrary = libraryAddressDataService.getLibraryAdress();
  }

  ngOnInit() {
  }



}
