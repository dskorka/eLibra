import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-library-address-data',
  templateUrl: './library-address-data.component.html',
  styleUrls: ['./library-address-data.component.css']
})
export class LibraryAddressDataComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  departmentLibrary = {
    libAdamow: {
      name: 'Gminna Biblioteka Publiczna w Adamowie',
      shortName: 'GBP w Adamowie',
      address: 'ul. Kleeberga 5c, 21-412 Adamów',
      phone: '25 755 31 47',
      email: 'biblioteka@adamow.pl',
      openingHour: [
        {
          monday: '8.00 - 18.00',
          tuesday: '8.00 - 18.00',
          wednesday: '8.00 - 18.00',
          thursday: '8.00 - 18.00',
          friday: '8.00 - 18.00',
          saturday: '8.00 - 18.00',
          sunday: '8.00 - 18.00'
        }
      ]
    },

    libWG :{
      name: 'Filia Biblioteczna w Woli Gułowskiej',
      shortName: 'FB w Woli Gułowskiej',
      address: 'ul. Słoneczna 5c, 21-412 Wola Gułowska',
      phone: '25 755 31 41',
      email: 'bibliotekaWG@adamow.pl',
      openingHour: [
        {
          monday: '8.00 - 18.00',
          tuesday: '8.00 - 18.00',
          wednesday: '8.00 - 18.00',
          thursday: '8.00 - 18.00',
          friday: '8.00 - 18.00',
          saturday: '8.00 - 18.00',
          sunday: '8.00 - 18.00'
        }
      ]
    }
  }

}
