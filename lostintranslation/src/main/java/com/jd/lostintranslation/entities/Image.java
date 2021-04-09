package com.jd.lostintranslation.entities;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String wordToSearch;
    @ElementCollection
    @Lob
    private Map<String, String[]> imgInformation;

    public Image() { }

    public Image(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public Image(String wordToSearch, Map<String, String[]> imgInformation) {
        this.wordToSearch = wordToSearch;
        this.imgInformation = imgInformation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWordToSearch() {
        return wordToSearch;
    }

    public void setWordToSearch(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public Map<String, String[]> getImgInformation() {
        return imgInformation;
    }

    public void setImgInformation(Map<String, String[]> imgInformation) {
        this.imgInformation = imgInformation;
    }
}
