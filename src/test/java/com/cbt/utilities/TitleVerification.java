package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification extends StringUtility{
    public static void main(String[] args) {


        List<String> urls = Arrays.asList(
                "http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
       String main =  driver.getTitle();
        String mainU = driver.getCurrentUrl();
        driver.get(urls.get(1));
        String dropdown =  driver.getTitle();
        String dropdownU = driver.getCurrentUrl();
        driver.get(urls.get(2));
        String login =  driver.getTitle();
        String loginU = driver.getCurrentUrl();

        verifyEquals(main,dropdown);
        verifyEquals(dropdown,login);
        verifyEquals(login,main);

        String comparative = "http://practice.cybertekschool.com";

        if ((mainU.startsWith(comparative))&&(loginU.startsWith(comparative))&&(dropdownU.startsWith(comparative))){
            System.out.println("URLs are the same");
        }
        else {
            System.out.println("urls are not the same");
        }
        driver.quit();

    }
}