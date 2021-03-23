import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { GoogleSearch } from '../model/googleSearch';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GoogleSearchService {

  private googleSearchPostUrl: string;
  private googleSearchstUrl: string;

  constructor(private http: HttpClient) { 
    this.googleSearchPostUrl = 'http://localhost:8080/search',
    this.googleSearchstUrl = 'http://localhost:8080/searchList';
  }

  public findAll(): Observable<GoogleSearch[]> {
    return this.http.get<GoogleSearch[]>(this.googleSearchstUrl);
  }

  public save(googleSearch: GoogleSearch) {
    return this.http.post<GoogleSearch>(this.googleSearchPostUrl, googleSearch);
  }
}