package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSeach_ETSY {
    public static void main(String[] args) {
         /*
        IN THIS TASK WE ARE SEARCHING THE WORD "WOODEN SPOON" IN ETSY
        */
        //TC #1: Google search
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Write "apple" in search box//in order to do this, we must locate it first
        //Thread.sleep(2000)
        // 4. Click ETSY search button
        WebElement etsySearchBox = driver.findElement(By.name("search_query"));//this locator will search all attributes then return the first match.
        etsySearchBox.sendKeys("Wooden spoon"+ Keys.ENTER);//this method goes to google search box, type apple, then click enter, then search "apple" word

        //5. Verify title:
        //Expected: Title should start with "wooden spoon" word
        String expectedInTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){//it checks the string "wooden spoon"", if it is correct, print passed, else failed
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!!!!!");
        }



        //close all browser window opened by driver
       // driver.quit();


    }
}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */