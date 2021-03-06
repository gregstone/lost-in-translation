package com.jd.lostintranslation;

import com.jd.lostintranslation.entities.Translation;
import com.jd.lostintranslation.repositories.TranslationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class LostInTranslationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostInTranslationApplication.class, args);
	}
	@Bean
	CommandLineRunner init(TranslationRepository translationRepository) {
		return args -> {
			Stream.of("salut", "maison", "table").forEach(inputWord -> {

				Translation translation = new Translation(inputWord);

				translationRepository.save(translation);
			});

			translationRepository.findAll().forEach(System.out::println);



			// call google translate api
//			GoogleTranslate translate = new GoogleTranslate();
//			translate.googleTranslate("Hola me llamo");

		};
	}




}
