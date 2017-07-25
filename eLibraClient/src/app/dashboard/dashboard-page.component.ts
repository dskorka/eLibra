import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard-page',
  template: `
    <app-nav-bar></app-nav-bar>
    <div class="container-fluid">
      <div class="row" style="padding-top: 50px">
        <div class="col-md-8">

          <app-lastest-article-panel></app-lastest-article-panel>
          <app-new-article-panel></app-new-article-panel>
          <app-carousel-footer></app-carousel-footer>

        </div>

        <div class="col-md-4">

          <app-search-by-word></app-search-by-word>
          <app-new-book-panel></app-new-book-panel>
          <app-subscription></app-subscription>
          <app-library-address-data></app-library-address-data>

        </div>
      </div>
    </div>
  `,
  styles: []
})
export class DashboardPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
