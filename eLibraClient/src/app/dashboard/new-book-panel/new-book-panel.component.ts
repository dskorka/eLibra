import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-book-panel',
  templateUrl: './new-book-panel.component.html',
  styleUrls: ['./new-book-panel.component.css']
})
export class NewBookPanelComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  books = [
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
  ]
}
