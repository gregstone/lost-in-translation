import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TranslationListComponent } from './translation-list/translation-list.component';
import { TranslationFormComponent } from './translation-form/translation-form.component';

const routes: Routes = [
  { path: 'translations', component: TranslationListComponent },
  { path: 'add', component: TranslationFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
