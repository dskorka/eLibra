import { Component, OnInit } from '@angular/core';
import {NewArticlePanelService} from "./new-article-panel.service";

@Component({
  selector: 'app-new-article-panel',
  templateUrl: './new-article-panel.component.html',
  styleUrls: ['./new-article-panel.component.css']
})
export class NewArticlePanelComponent implements OnInit {

  articles=[];

  constructor(private newArticlePanelService:NewArticlePanelService) {
    this.articles = this.newArticlePanelService.getArticles();
  }

  ngOnInit() {
  }



}
