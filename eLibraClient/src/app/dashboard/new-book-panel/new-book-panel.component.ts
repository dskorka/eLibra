import { Component, OnInit } from '@angular/core';
import {NewBookPanelService} from "./new-book-panel.service";

@Component({
  selector: 'app-new-book-panel',
  templateUrl: './new-book-panel.component.html',
  styleUrls: ['./new-book-panel.component.css']
})
export class NewBookPanelComponent implements OnInit {

  books=[];

  constructor(private newBookPanelService:NewBookPanelService) {
    this.books = this.newBookPanelService.getBooks();
  }

  ngOnInit() {
  }


}
