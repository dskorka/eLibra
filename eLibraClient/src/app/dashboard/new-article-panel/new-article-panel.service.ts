import { Injectable } from '@angular/core';

@Injectable()
export class NewArticlePanelService {

  private articles = [
    {
      id: 1,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    },
    {
      id: 2,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    },
    {
      id: 3,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    },
    {
      id: 4,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    },
    {
      id: 5,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    },
    {
      id: 6,
      title: 'Card title',
      shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content.....',
      imageSrc: 'http://via.placeholder.com/250x150'
    }
  ];

  constructor() { }

  getArticles(){
    return this.articles;
  }

}
