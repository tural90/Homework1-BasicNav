package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){



        if(expected.equals(actual)){
            System.out.println("PASS");
            System.out.println("URL is the same");
        }
        else {
            System.out.println("FAIL");
            System.out.println("url is not the same");
        }


    }
}
