package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5___WindowsHandling {
    WebDriver driver;

    //  @BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }
    @Test
    public void multiple_window_test(){

        //Storing the main page's window handle as string is good practice for future re-usable purpose
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert : Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Title before click:"+ actualTitle);

        //5. Click to : "Click Here" link
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        //6. Switch to new window
        Set<String>allWindowHandles = driver.getWindowHandles();
        //window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each: allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());
        }

        //7. Assert: title is "New Window"
        String expectedTitleAfterClick = "New Window";
        actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
        System.out.println("Title after click : "+ actualTitle);
        //if we want to go bact to main page, we can use already stored main handle
        driver.switchTo().window(mainHandle);

    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
       driver.quit();
    }
}
