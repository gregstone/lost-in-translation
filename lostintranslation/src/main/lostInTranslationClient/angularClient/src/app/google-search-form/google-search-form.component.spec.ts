import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GoogleSearchFormComponent } from './google-search-form.component';

describe('GoogleSearchFormComponent', () => {
  let component: GoogleSearchFormComponent;
  let fixture: ComponentFixture<GoogleSearchFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GoogleSearchFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GoogleSearchFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
