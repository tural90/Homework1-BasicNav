package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests extends StringUtility {
    public static void main(String[] args) {

        System.out.println("here is test execution for safari");
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String titleG = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String titleE = driver.getTitle();

        driver.navigate().back();
        String titleF = driver.getTitle();

        driver.navigate().forward();
        String titleZ = driver.getTitle();

        verifyEquals(titleG, titleF);
        verifyEquals(titleE, titleZ);

        System.out.println(titleG);
        System.out.println(titleF);
        System.out.println(titleE);
        System.out.println(titleZ);

        driver.quit();


        System.out.println("=============================");


    }
}