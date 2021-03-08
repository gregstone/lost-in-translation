package com.jd.lostintranslation;

import com.jd.lostintranslation.entities.Translation;
import com.jd.lostintranslation.repositories.TranslationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.stream.Stream;

@SpringBootApplication
public class LostInTranslationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostInTranslationApplication.class, args);

		GoogleSearch googleSearch = new GoogleSearch();
		googleSearch.searchOnGoogle();
	}

	@Bean
	CommandLineRunner init(TranslationRepository translationRepository) {
		return args -> {
			Stream.of("salut").forEach(inputWord -> {

				Translation translation = new Translation(inputWord);

				translationRepository.save(translation);
			});

			translationRepository.findAll().forEach(System.out::println);

		};
	}




}
