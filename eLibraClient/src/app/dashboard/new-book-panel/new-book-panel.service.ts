import { Injectable } from '@angular/core';

@Injectable()
export class NewBookPanelService {

  private books = [
    {
      id: '1',
      title: 'Test',
      author: 'Test',
      status: 'Na półce',
      srcImage: 'http://via.placeholder.com/140x218'
    },
    {
      id: '2',
      title: 'Test',
      author: 'Test',
      status: 'Wypożyczone',
      srcImage: 'http://via.placeholder.com/140x218'
    },
    {
      id: '3',
      title: 'Test',
      author: 'Test',
      status: 'Na półce',
      srcImage: 'http://via.placeholder.com/140x218'
    },
    {
      id: '4',
      title: 'Test',
      author: 'Test',
      status: 'Wypożyczone',
      srcImage: 'http://via.placeholder.com/140x218'
    }
  ];

  constructor() { }

  getBooks(){
    return this.books;
  }

}
