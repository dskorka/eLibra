import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { CarouselFooterComponent } from './dashboard/carousel-footer/carousel-footer.component';
import { LastestArticlePanelComponent } from './dashboard/lastest-article-panel/lastest-article-panel.component';
import { LibraryAddressDataComponent } from './dashboard/library-address-data/library-address-data.component';
import { NavBarComponent } from './dashboard/nav-bar/nav-bar.component';
import { NewArticlePanelComponent } from './dashboard/new-article-panel/new-article-panel.component';
import { NewBookPanelComponent } from './dashboard/new-book-panel/new-book-panel.component';
import { SearchByWordComponent } from './dashboard/search-by-word/search-by-word.component';
import { SubscriptionComponent } from './dashboard/subscription/subscription.component';
import { DashboardPageComponent } from './dashboard/dashboard-page.component';
import {CarouselFooterService} from "./dashboard/carousel-footer/carousel-footer.service";
import {LastestArticleService} from "./dashboard/lastest-article-panel/lastest-article.service";
import {LibraryAddressDataService} from "./dashboard/library-address-data/library-address-data.service";
import {NewArticlePanelService} from "./dashboard/new-article-panel/new-article-panel.service";
import {NewBookPanelService} from "./dashboard/new-book-panel/new-book-panel.service";

@NgModule({
  declarations: [
    AppComponent,
    CarouselFooterComponent,
    LastestArticlePanelComponent,
    LibraryAddressDataComponent,
    NavBarComponent,
    NewArticlePanelComponent,
    NewBookPanelComponent,
    SearchByWordComponent,
    SubscriptionComponent,
    DashboardPageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [
    CarouselFooterService,
    LastestArticleService,
    LibraryAddressDataService,
    NewArticlePanelService,
    NewBookPanelService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
