package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

          /*
        IN THIS CLASS WE ARE SOLVING THE DAY2_TASK3
         */
        //TC #2: Google search
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://google.com
        driver.get("https://google.com");

        //3. Write "apple" in search box//in order to do this, we must locate it first
        //Thread.sleep(2000)
        // 4. Click google search button
        WebElement googleSearchBox = driver.findElement(By.name("q"));//this locator will search all attributes then return the first match.
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);//this method goes to google search box, type apple, then click enter, then search "apple" word

        //5. Verify title:
        //Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){//it checks the string "apple", if it is correct, print passed, else failed
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!!!!!");
        }





    }
}
