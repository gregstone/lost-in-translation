import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Translation } from '../model/translation';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
 })
export class TranslationService {

  private translationsUrl: string;
  private translationsPostUrl: string;

  constructor(private http: HttpClient) {
    this.translationsUrl = 'http://localhost:8080/translations';
    this.translationsPostUrl = 'http://localhost:8080/add';
  }

  public findAll(): Observable<Translation[]> {
    return this.http.get<Translation[]>(this.translationsUrl);
  }

  public save(translation: Translation) {
    return this.http.post<Translation>(this.translationsPostUrl, translation);
  }
}

