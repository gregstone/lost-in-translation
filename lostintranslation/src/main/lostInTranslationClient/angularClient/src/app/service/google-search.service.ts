import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { GoogleSearch } from '../model/googleSearch';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GoogleSearchService {

  private googleSearchPostUrl: string;

  constructor(private http: HttpClient) { 
    this.googleSearchPostUrl = 'http://localhost:8080/search'
  }

  public save(googleSearch: GoogleSearch) {
    return this.http.post<GoogleSearch>(this.googleSearchPostUrl, googleSearch);
  }
}