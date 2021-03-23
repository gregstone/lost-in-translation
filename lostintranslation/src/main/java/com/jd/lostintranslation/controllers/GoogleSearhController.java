package com.jd.lostintranslation.controllers;

import com.jd.lostintranslation.GoogleSearch;
import com.jd.lostintranslation.entities.Search;
import com.jd.lostintranslation.entities.Translation;
import com.jd.lostintranslation.repositories.GoogleSearchRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GoogleSearhController {

    private final GoogleSearchRepository googleSearchRepository;

    public GoogleSearhController(GoogleSearchRepository googleSearchRepository) {
        this.googleSearchRepository = googleSearchRepository;
    }

    // todo : test with postman
    @PostMapping("/search")
    public Search googleSearch(@RequestBody Search wordToSearch) {

        // perform google search
        GoogleSearch googleSearch = new GoogleSearch();
        Map<String, String> searchResults = googleSearch.searchOnGoogle(wordToSearch.getWordToSearch());

        // build Search object to return google search results
        Search buildSearchObject = new Search(
                wordToSearch.getWordToSearch(),
                searchResults);

        // save search object
        Search newSearch = googleSearchRepository.save(buildSearchObject);

        System.out.println("\n WORD TO SEARCH ON GOOGLE = "+ wordToSearch.getWordToSearch() +"\n" );
        System.out.println("\n GOOGLE SEARCH RESULT = "+ newSearch +"\n" );

        return newSearch;
    }
    @GetMapping("/searchList")
    public List<Search> getSearch() {
        return (List<Search>) googleSearchRepository.findAll();
    }

}
