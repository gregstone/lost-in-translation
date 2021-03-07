package com.jd.lostintranslation;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GoogleSearch {
    //We need a real browser user agent or Google will block our request with a 403 - Forbidden
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
                                            "AppleWebKit/537.36 (KHTML, like Gecko) " +
                                            "Chrome/45.0.2454.101 Safari/537.36";

    public void googleSearch(String searchQuery) throws IOException {

        // Retrieve google search results
        final Document googleSearchResults = Jsoup
                .connect("https://google.com/search?q=" + searchQuery)
                .userAgent(USER_AGENT)
                .get();

        String resultLink = "#main > div:gt(3) a";

        // Traverse the results
        for (Element result : googleSearchResults.select(resultLink)){

            final String title = result.text();
            final String url = result.attr("href");

            // todo : use the google search result
            System.out.println("LINK TITLE :: " + title + " \n\t -> " + url);
        }
    }
}
