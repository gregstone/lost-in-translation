import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { TranslationListComponent } from './translation-list/translation-list.component';
import { TranslationFormComponent } from './translation-form/translation-form.component';
import { TranslationService } from './service/translation.service';
import { GoogleSearchFormComponent } from './google-search-form/google-search-form.component';
import { GoogleSearchResultsListComponent } from './google-search-results-list/google-search-results-list.component';
import { ImageSearchFormComponent } from './image-search-form/image-search-form.component';
import { ImageSearchResultsListComponent } from './image-search-results-list/image-search-results-list.component';


@NgModule({
  declarations: [
    AppComponent,
    TranslationListComponent,
    TranslationFormComponent,
    GoogleSearchFormComponent,
    GoogleSearchResultsListComponent,
    ImageSearchFormComponent,
    ImageSearchResultsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [TranslationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
