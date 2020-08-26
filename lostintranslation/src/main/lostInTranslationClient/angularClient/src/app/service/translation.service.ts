import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Translation } from '../model/translation';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class TranslationService {

  private translationsUrl: string;

  constructor(private http: HttpClient) {
    this.translationsUrl = 'http://localhost:8080/translations';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<Translation[]>(this.translationsUrl);
  }

  public save(translation: Translation) {
    return this.http.post<Translation>(this.translationsUrl, translation);
  }
}

