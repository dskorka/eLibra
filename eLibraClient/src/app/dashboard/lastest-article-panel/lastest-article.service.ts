import { Injectable } from '@angular/core';

@Injectable()
export class LastestArticleService {

  constructor() { }

  private lastArticle = {
    id: 1,
    title: 'Najnowszy artytuł!',
    shortDescription: 'Some quick example text to build on the card title and make up the bulk of the card\'s content....',
    imageHref: 'http://via.placeholder.com/250x150'
  };

  getLastArticle() {
    return this.lastArticle;
  }
}
