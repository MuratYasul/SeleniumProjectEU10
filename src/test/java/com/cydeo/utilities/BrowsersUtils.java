package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
In this class only general utility methods that are not related to some specific page.
 */
public class BrowsersUtils {
    /*
    This method will accept int (in seconds) and execute Thread.sleep for given duration
    */
    public static void sleep (int second){
        second *=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            }

    }
    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verifying if the url contains given String
        if condition matches, will break loop.
    Arg3: expectedTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl,String expectedInTitle){
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each: driver.getWindowHandles() ) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
        //5. Assert: Title contains "expectedInTitle"
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    /*
    This method accepts a String "expectedInTitle" and Asserts if it is true
     */
    public static void verifyTitle(WebDriver driver, String expectedInTitle){
        Assert.assertEquals(driver.getTitle(),expectedInTitle);


    }
}





