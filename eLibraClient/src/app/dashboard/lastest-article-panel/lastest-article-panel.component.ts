import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lastest-article-panel',
  templateUrl: './lastest-article-panel.component.html',
  styleUrls: ['./lastest-article-panel.component.css']
})
export class LastestArticlePanelComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  lastArticle = {
    id: 1,
    title: 'Najnowszy artytuł!',
    shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content....',
    imageHref: 'http://via.placeholder.com/250x150'
  }
}
