import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TranslationListComponent } from './translation-list/translation-list.component';
import { TranslationFormComponent } from './translation-form/translation-form.component';
import { GoogleSearchFormComponent } from './google-search-form/google-search-form.component';
import { GoogleSearchResultsListComponent } from './google-search-results-list/google-search-results-list.component';

const routes: Routes = [
  { path: 'translations', component: TranslationListComponent },
  { path: 'add', component: TranslationFormComponent },
  { path: 'search', component: GoogleSearchFormComponent },
  { path: 'searchList', component: GoogleSearchResultsListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
