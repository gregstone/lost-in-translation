package com.jd.lostintranslation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleSearch {

    /**
     * Perform Google search
     * @return : map with each link and title result
     */

    public Map<String, String> searchOnGoogle(String wordToSearch){

        // set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\APPLICATIONS\\webdriver\\chromedriver.exe");

        // create chrome session
        WebDriver driver = new ChromeDriver();
        // call url
        driver.get("https://www.google.com/search?q="+ wordToSearch +"&rlz=1C1CHBF_frFR908FR908&oq=camion&aqs=chrome..69i57j0l9.7453j0j7&sourceid=chrome&ie=UTF-8");

        // target <a> tag
        List<WebElement> googleResultLink = driver.findElements(By.xpath("//*[@class=\"g\"]/div/div[1]/a"));

        // Store result links and text for each result
        Map<String, String> linksAndTitle = new HashMap<>();

        googleResultLink.forEach(linkTag -> {

            // select <h3> and get link title
            // We use getAttribute instead of getText() in order to retrieve element outside viewport
            String urlText = linkTag.findElement(By.cssSelector("h3"))
                    .getAttribute("textContent");

            // select link
            String href = linkTag.getAttribute("href");

            linksAndTitle.put(urlText, href);
        });

        return linksAndTitle;
    }
}

