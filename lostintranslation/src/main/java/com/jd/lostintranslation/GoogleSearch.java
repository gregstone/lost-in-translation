package com.jd.lostintranslation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public void searchOnGoogle(){

        // set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\APPLICATIONS\\webdriver\\chromedriver.exe");

        // create chrome session
        WebDriver driver = new ChromeDriver();
        // call url
        driver.get("https://www.google.com/search?q=camion&rlz=1C1CHBF_frFR908FR908&oq=camion&aqs=chrome..69i57j0l9.7453j0j7&sourceid=chrome&ie=UTF-8");

        // todo : remove
        String title = driver.getTitle();
        System.out.println("PAGE TITLE == " + title);

    }
}

