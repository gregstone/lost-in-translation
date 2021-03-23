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
    this.googleSearchService.save(this.googleSearch).subscribe(result => this.gotoGoogleSearchResulsList());
  }

  // redirect user to /searchList
  gotoGoogleSearchResulsList() {
   this.router.navigate(['/searchList']);
  }

  // SUBMIT FORM WITH ENTER KEY PRESS
  handleKeyUp(e: { keyCode: number; }){
    if(e.keyCode === 13){
      this.handleSubmit(e);
    }
  }

  handleSubmit(e: { keyCode?: number; preventDefault?: any; }){
    e.preventDefault();
  }
}