package com.jd.lostintranslation.controllers;

import com.jd.lostintranslation.GoogleTranslate;
import com.jd.lostintranslation.entities.Translation;
import com.jd.lostintranslation.repositories.TranslationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * In the Spring framework, A Controller is a class that is responsible for :
 * - preparing a model Map with data to be displayed by the view
 * - choosing the right view itself
 *
 * It can also directly write into the response stream by using @ResponseBody annotation and complete the request.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TranslationController {

    private final TranslationRepository translationRepository;

    public TranslationController(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    @GetMapping("/translations")
    public List<Translation> getTranslations() {
        return (List<Translation>) translationRepository.findAll();
    }

    // SIMPLE WORKING EXAMPLE
//    @PostMapping("/translations")
//    Translation addTranslation(@RequestBody Translation translation) {
//        Translation newtranslation = translationRepository.save(translation);
//        System.out.println("new translation was posted == " + translation.getWord());
//        return newtranslation;
//    }

    // TEST POST GOOGLE TRANSLATE
    @PostMapping("/add")
    Translation addTranslation(@RequestBody Translation wordToTranslate) {

        // perform translation
    	GoogleTranslate translate = new GoogleTranslate();
        String translatedWord = translate.googleTranslate(wordToTranslate.getWord());

        // build Translation object to return and save
        Translation buildTranslationObject = new Translation(translatedWord);

        // save new translation object
        Translation newTranslation = translationRepository.save(buildTranslationObject);

        System.out.println("new translation was posted ");
        System.out.println("Input word : " + wordToTranslate);
        System.out.println("Translated word: " + translatedWord);

        return newTranslation;

    }
}

