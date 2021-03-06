package com.jd.lostintranslation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String wordToTranslate;
    private String translatedWord;

    public Translation() {
    }

    public Translation(String word) {
        this.wordToTranslate = word;
    }

    public Translation(String wordToTranslate, String translatedWord) {
        this.wordToTranslate = wordToTranslate;
        this.translatedWord = translatedWord;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWordToTranslate() {
        return wordToTranslate;
    }

    public void setWordToTranslate(String wordToTranslate) {
        this.wordToTranslate = wordToTranslate;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "id=" + id +
                ", word='" + wordToTranslate + '\'' +
                '}';
    }
}

