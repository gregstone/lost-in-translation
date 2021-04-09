import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ImageSearch } from '../model/imageSearch';
import { ImageSearchService } from '../service/image-search.service';

@Component({
  selector: 'app-image-search-form',
  templateUrl: './image-search-form.component.html',
  styleUrls: ['./image-search-form.component.css']
})
export class ImageSearchFormComponent {

  imageSearch : ImageSearch;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private imageSearchService : ImageSearchService) {
      this.imageSearch = new ImageSearch();
    }
  
  onSubmit() {
    this.imageSearchService.save(this.imageSearch).subscribe(result => this.gotoImageSearchResulsList());
  }

  // redirect user to /searchList
  gotoImageSearchResulsList() {
    this.router.navigate(['/imageList']);
  }
}
