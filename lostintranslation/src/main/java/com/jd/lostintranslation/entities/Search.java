package com.jd.lostintranslation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String wordToSearch;
    private Map<String, String> searchResults;

    public Search() { }

    public Search(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public Search(String wordToSearch, Map<String, String> searchResults) {
        this.wordToSearch = wordToSearch;
        this.searchResults = searchResults;
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

    public Map<String, String> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(Map<String, String> searchResults) {
        this.searchResults = searchResults;
    }

    @Override
    public String toString() {
        return "Search{" +
                "id=" + id +
                ", wordToSearch='" + wordToSearch + '\'' +
                ", searchResults=" + searchResults +
                '}';
    }
}
