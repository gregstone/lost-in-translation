import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { TranslationListComponent } from './translation-list/translation-list.component';
import { TranslationFormComponent } from './translation-form/translation-form.component';
import { TranslationService } from './service/translation.service';


@NgModule({
  declarations: [
    AppComponent,
    TranslationListComponent,
    TranslationFormComponent
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