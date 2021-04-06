import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ImageSearch } from '../model/imageSearch';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ImageSearchService {

  private imageSearchPostUrl: string;
  private imageSearchstUrl: string;

  constructor(private http: HttpClient) { 
    this.imageSearchPostUrl = 'http://localhost:8080/image',
    this.imageSearchstUrl = 'http://localhost:8080/imageSearchList';
  }

  public save(imageSearch: ImageSearch) {
    return this.http.post<ImageSearch>(this.imageSearchPostUrl, imageSearch);
  }

  public findAll(): Observable<ImageSearch[]> {
    return this.http.get<ImageSearch[]>(this.imageSearchstUrl);
  }
}