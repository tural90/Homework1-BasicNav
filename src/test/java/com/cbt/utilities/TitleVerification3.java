package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");




        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String lulu = driver.getTitle();
        lulu = lulu.replace(" ","").toLowerCase();
        System.out.println(lulu);
        if (urls.get(0).contains(lulu)){
            System.out.println("URL contains title");
        }
        else {
            System.out.println("URL does not contain title");
        }

        driver.close();
        System.out.println("================");
        driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(1));
        String wayfair = driver.getTitle();
        wayfair = wayfair.replace(" ","").toLowerCase();
        System.out.println(wayfair);

        if (urls.get(1).contains(wayfair)){
            System.out.println("URL contains title");
        }
        else {
            System.out.println("URL does not contain title");
        }
        driver.close();

        System.out.println("================");
        driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(2));
        String walmart = driver.getTitle();
        walmart = walmart.replace(" ","").toLowerCase();
        System.out.println(walmart);
        if (urls.get(2).contains(walmart)){
            System.out.println("URL contains title");
        }
        else {
            System.out.println("URL does not contain title");
        }
        driver.close();


        System.out.println("================");

        driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(3));
        String westelm = driver.getTitle();
        westelm = westelm.replace(" ","").toLowerCase();
        System.out.println(westelm);
        if (urls.get(3).contains(westelm)){
            System.out.println("URL contains title");
        }
        else {
            System.out.println("URL does not contain title");
        }

        driver.quit();

    }
}
