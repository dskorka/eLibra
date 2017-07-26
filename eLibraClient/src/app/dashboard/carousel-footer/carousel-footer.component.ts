import { Component, OnInit, Inject } from '@angular/core';
import { CarouselFooterService } from './carousel-footer.service'

@Component({
  selector: 'app-carousel-footer',
  templateUrl: './carousel-footer.component.html',
  styleUrls: ['./carousel-footer.component.css']
})
export class CarouselFooterComponent implements OnInit {

  carouselFooter = {};

  constructor(private carouselFooterService:CarouselFooterService) {
    this.carouselFooter = this.carouselFooterService.getCarouselFooter();
  }

  ngOnInit() {
  }





}
