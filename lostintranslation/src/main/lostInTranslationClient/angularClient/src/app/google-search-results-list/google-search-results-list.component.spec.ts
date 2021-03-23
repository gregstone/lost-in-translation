import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GoogleSearchResultsListComponent } from './google-search-results-list.component';

describe('GoogleSearchResultsListComponent', () => {
  let component: GoogleSearchResultsListComponent;
  let fixture: ComponentFixture<GoogleSearchResultsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GoogleSearchResultsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GoogleSearchResultsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
