import { Injectable } from '@angular/core';

@Injectable()
export class CarouselFooterService {

  constructor() { }

  private carouselFooter = {
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
  };

  getCarouselFooter(){
    return this.carouselFooter;
  }
}
