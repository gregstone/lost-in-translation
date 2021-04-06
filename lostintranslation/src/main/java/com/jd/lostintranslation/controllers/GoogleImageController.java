package com.jd.lostintranslation.controllers;

import com.jd.lostintranslation.GoogleImage;
import com.jd.lostintranslation.GoogleSearch;
import com.jd.lostintranslation.entities.Image;
import com.jd.lostintranslation.entities.Search;
import com.jd.lostintranslation.repositories.GoogleImageRepository;
import com.jd.lostintranslation.repositories.GoogleSearchRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GoogleImageController {

    private final GoogleImageRepository googleImageRepository;

    public GoogleImageController(GoogleImageRepository googleImageRepository) {
        this.googleImageRepository = googleImageRepository;
    }

    // todo : test with postman
    @PostMapping("/image")
    public Image googleImageSearch(@RequestBody Image wordToSearch) {

        // perform google image search
        GoogleImage googleImage = new GoogleImage();
        Map<String, String[]> searchResults = googleImage.searchImageOnGoogle(wordToSearch.getWordToSearch());

        // build Search object to return google image search results
        Image buildImageSearchObject = new Image(
                wordToSearch.getWordToSearch(),
                searchResults);

        // save search object
        Image newImageSearch = googleImageRepository.save(buildImageSearchObject);

        System.out.println("\n WORD TO SEARCH ON GOOGLE = "+ wordToSearch.getWordToSearch() +"\n" );
        System.out.println("\n GOOGLE IMAGE SEARCH RESULT = "+ newImageSearch +"\n" );

//        return newImageSearch;
        return buildImageSearchObject;
    }
    @GetMapping("/imageSearchList")
    public List<Image> getImageSearch() {
        return (List<Image>) googleImageRepository.findAll();
    }

}
