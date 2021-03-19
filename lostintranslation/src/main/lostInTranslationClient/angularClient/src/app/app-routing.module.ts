import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TranslationListComponent } from './translation-list/translation-list.component';
import { TranslationFormComponent } from './translation-form/translation-form.component';
import { GoogleSearchFormComponent } from './google-search-form/google-search-form.component';

const routes: Routes = [
  { path: 'translations', component: TranslationListComponent },
  { path: 'add', component: TranslationFormComponent },
  { path: 'search', component: GoogleSearchFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
