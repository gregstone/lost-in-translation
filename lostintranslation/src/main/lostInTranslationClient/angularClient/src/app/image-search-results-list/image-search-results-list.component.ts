import { Component, OnInit } from '@angular/core';
import { ImageSearch } from '../model/imageSearch';
import { ImageSearchService } from '../service/image-search.service';

@Component({
  selector: 'app-image-search-results-list',
  templateUrl: './image-search-results-list.component.html',
  styleUrls: ['./image-search-results-list.component.css']
})
export class ImageSearchResultsListComponent {

  imageSearchResults : ImageSearch[]; 

  constructor(private imageSearchService : ImageSearchService) { }

  ngOnInit() {
    this.imageSearchService.findAll().subscribe(data => {
      this.imageSearchResults = data;
     });
  }

}