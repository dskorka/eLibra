import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carousel-footer',
  templateUrl: './carousel-footer.component.html',
  styleUrls: ['./carousel-footer.component.css']
})
export class CarouselFooterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  carouselFooter = {
    title: 'Polecane',
    branding: [
      {
        href: '#',
        src: 'http://via.placeholder.com/350x150'
      },
      {
        href: '#',
        src: 'http://via.placeholder.com/350x150'
      }
    ]
  }

}
