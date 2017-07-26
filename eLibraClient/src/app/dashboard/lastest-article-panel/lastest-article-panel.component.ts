import { Component, OnInit } from '@angular/core';
import {LastestArticleService} from './lastest-article.service'

@Component({
  selector: 'app-lastest-article-panel',
  templateUrl: './lastest-article-panel.component.html',
  styleUrls: ['./lastest-article-panel.component.css']
})
export class LastestArticlePanelComponent implements OnInit {

  lastArticle = {};

  constructor(private lastArticleService: LastestArticleService) {
    this.lastArticle = lastArticleService.getLastArticle()
  }

  ngOnInit() {
  }


}
