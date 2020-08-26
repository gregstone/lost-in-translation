import { Component, OnInit } from '@angular/core';
import { Translation } from '../model/translation';
import { TranslationService } from '../service/translation.service';

@Component({
  selector: 'app-translation-list',
  templateUrl: './translation-list.component.html',
  styleUrls: ['./translation-list.component.css']
})
export class TranslationListComponent implements OnInit {

  translations : Translation[];

  constructor(private translationService: TranslationService) { }

  ngOnInit() {
    this.translationService.findAll().subscribe(data => {
      this.translations = data;
     });
  }
}


