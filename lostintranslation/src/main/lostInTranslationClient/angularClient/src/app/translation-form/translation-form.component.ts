import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Translation } from '../model/translation';
import { TranslationService } from '../service/translation.service';

@Component({
  selector: 'app-translation-form',
  templateUrl: './translation-form.component.html',
  styleUrls: ['./translation-form.component.css']
})
export class TranslationFormComponent {

  translation : Translation;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private translationService: TranslationService) {
      this.translation = new Translation();
    }

  // save new translation in db on submit
  onSubmit() {
    this.translationService.save(this.translation).subscribe(result => this.gotoTranslationList());
  }

  // redirect user to /translations in order to re display the list of translation after new translation add
  gotoTranslationList() {
    this.router.navigate(['/translations']);
  }

  // SUBMIT FORM WITH ENTER KEY PRESS
  handleKeyUp(e: { keyCode: number; }){
    if(e.keyCode === 13){
      this.handleSubmit(e);
    }
  }

  handleSubmit(e: { keyCode?: number; preventDefault?: any; }){
    e.preventDefault();
    alert("ERROR");
  }
}

