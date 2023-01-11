package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_CydeoHomePage {
    public static void main(String[] args) {
           /*
        IN THIS CLASS WE ARE SOLVING THE DAY2_TASK4
         */
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Click to “Home” link

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();


////        //4. Verify title:
////        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title " + "\"" +expectedTitle+"\" verification PASSED!");
        }else {
            System.out.println("Title "+expectedTitle+ " verification FAILED!!!!!");
        }
 driver.close();
    }
}



/*TC #4: Practice Cydeo – Class locator practice
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/inputs
        3- Click to “Home” link
        4- Verify title is as expected:
        Expected: Practice

        PS: Locate “Home” link using “className” locator
 */