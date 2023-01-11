package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_getAttribute {
    public static void main(String[] args) {
         /*
        IN THIS CLASS WE ARE SOLVING THE DAY2_TASK5_getText
         */
        //TC #5: GetText() and getAttribute() method practice
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3. Verify header text is as expected:
        //  expected : Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = headerText.getText();
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else {
            System.out.println("Header Text Verification FAILED!!!!!");
        }

        //4. Locate "First name" input box
        //we are locating the web element usin "name" locator
        //name attribute has "firstname" value
        WebElement firsNameInput = driver.findElement(By.name("firstname"));

        //5. Verify placeholder attribute's value is as expected:
        // Expected : first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firsNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder verification PASSED!");
        }else {
            System.out.println("PlaceHolder Verification FAILED!!!!!");
        }

        driver.close();




    }
}
