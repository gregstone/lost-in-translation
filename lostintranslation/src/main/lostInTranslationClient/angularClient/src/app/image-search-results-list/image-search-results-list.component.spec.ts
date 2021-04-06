import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ImageSearchResultsListComponent } from './image-search-results-list.component';

describe('ImageSearchResultsListComponent', () => {
  let component: ImageSearchResultsListComponent;
  let fixture: ComponentFixture<ImageSearchResultsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ImageSearchResultsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ImageSearchResultsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
