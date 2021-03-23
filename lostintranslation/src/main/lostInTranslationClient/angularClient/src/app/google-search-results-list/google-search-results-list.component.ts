import { Component, OnInit } from '@angular/core';
import { GoogleSearch } from '../model/googleSearch';
import { GoogleSearchService } from '../service/google-search.service';

@Component({
  selector: 'app-google-search-results-list',
  templateUrl: './google-search-results-list.component.html',
  styleUrls: ['./google-search-results-list.component.css']
})
export class GoogleSearchResultsListComponent implements OnInit {

  googleSearchResults : GoogleSearch[]; 

  constructor(private googleSearchService : GoogleSearchService) { }

  ngOnInit() {
    this.googleSearchService.findAll().subscribe(data => {
      this.googleSearchResults = data;
     });
  }
}
