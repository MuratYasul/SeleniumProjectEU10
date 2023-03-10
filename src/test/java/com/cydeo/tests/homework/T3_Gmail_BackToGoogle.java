package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */
public class T3_Gmail_BackToGoogle {
    public static void main(String[] args) {
       //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right
        WebElement abTestLink = driver.findElement(By.linkText("Gmail"));
        abTestLink.click();

        // 4- Verify title contains:
        //  Expected: Gmail
      WebElement headerText = driver.findElement(By.linkText("Gmail"));
        String expectedTitle = headerText.getText();
        String actualTitle = headerText.getText();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!!!!!");
        }
       // 5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
       // Expected: Google
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title " + "\"" +expectedTitle+"\" verification PASSED!");
        }else {
            System.out.println("Title "+expectedTitle+ " verification FAILED!!!!!");
        }

    }

}
