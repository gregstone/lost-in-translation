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
    private String word;

    public Translation() {
    }

    public Translation(String word) {
        this.word = word;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "id=" + id +
                ", word='" + word + '\'' +
                '}';
    }
}

