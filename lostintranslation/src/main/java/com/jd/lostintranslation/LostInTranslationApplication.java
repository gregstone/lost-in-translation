package com.jd.lostintranslation;

import com.jd.lostintranslation.entities.Translation;
import com.jd.lostintranslation.repositories.TranslationRepository;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LostInTranslationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostInTranslationApplication.class, args);
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
