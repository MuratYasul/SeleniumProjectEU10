package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTest_Practice {
    public static void main(String[] args) {
         /*
        IN THIS CLASS WE ARE SOLVING THE DAY2_TASK2
         */
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //3. Click to A/B Testing from top of the list
        //Expected : A/B Testing button
        //Thread.sleep(2000)
        //driver.findElement(By.linkText("A/B Testing")).click();//this method opens the html page, and goes to the text we have specified.
        //here this method does not store what we see, it disappears, bul WebElement () method does store in order to use again.
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();//this method is more preferable to well documented



        //4. Verify title
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!!!!!");
        }

        //5. Go back to home page by using the .back()
       driver.navigate().back();

        //6. Verify title equals:

        //Expected: Practice

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!!!!!");
        }






    }
}
