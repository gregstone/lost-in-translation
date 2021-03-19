import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GoogleSearch } from '../model/googleSearch';
import { GoogleSearchService } from '../service/google-search.service';

@Component({
  selector: 'app-google-search-form',
  templateUrl: './google-search-form.component.html',
  styleUrls: ['./google-search-form.component.css']
})
export class GoogleSearchFormComponent {

  googleSearch : GoogleSearch;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private googleSearchService : GoogleSearchService) {
      this.googleSearch = new GoogleSearch();
    }


  
  onSubmit() {
    this.googleSearchService.save(this.googleSearch).subscribe(result => this.gotoTranslationList());
  }


  // todo : to be remove just for test purpose 
  // redirect user to /translations in order to re display the list of translation after new translation add
  gotoTranslationList() {
    this.router.navigate(['/translations']);
  }

}