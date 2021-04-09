package com.jd.lostintranslation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleImage {

    /**
     * Perform Google image search
     * @return : map with each image title and and array with :
     *  - image link
     *  - image website link
     */
    public Map<String, String[]> searchImageOnGoogle(String wordToSearch){

        // set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\APPLICATIONS\\webdriver\\chromedriver.exe");

        // configure chrome browser options : run chrome headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        // create chrome session
        WebDriver driver = new ChromeDriver(options);
        // call url
        driver.get("https://www.google.com/images?q="+ wordToSearch);

        // target <a> tag containing image website link
        List<WebElement> targetLinkTag = driver.findElements(By.xpath("//*[@class=\"islrc\"]/div/a[2]"));

        // Store result links and text for each result
        Map<String, String[]> imgInformation = new HashMap<>();

        targetLinkTag.forEach(linkTag -> {

            String href = linkTag.getAttribute("href");

            String imgLink = linkTag.findElement(By.xpath("./../a[1]/div/img")).getAttribute("src");
            if (imgLink == null) {
                imgLink =  linkTag.findElement(By.xpath("./../a[1]/div/img")).getAttribute("data-src");
            }

            String imgText = linkTag.getText();

            String[] linkTab = new String[]{href, imgLink};

            imgInformation.put(imgText, linkTab);
            System.out.println("\nLINK TAB HREF = \n\t" + linkTab[0]);
            System.out.println("\nLINK TAB IMG LINK = \n\t" + linkTab[1]);
            System.out.println("IMG TEXT = \n\t" + imgText + "\n");
        });

        // close browser and driver
        driver.quit();

        return imgInformation;
    }
}