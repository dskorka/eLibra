import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-article-panel',
  templateUrl: './new-article-panel.component.html',
  styleUrls: ['./new-article-panel.component.css']
})
export class NewArticlePanelComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  articles = [
    {
      id: 1,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    },
    {
      id: 2,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    },
    {
      id: 3,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    },
    {
      id: 4,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    },
    {
      id: 5,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    },
    {
      id: 6,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/350x150'
    }
  ]

}
