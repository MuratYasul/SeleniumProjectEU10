package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

  //  @BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }

  // @Ignore
    @Test

    public void iframe_test(){
        //We need to switchTo() driver's focus to iframe
        //option #1 switching to iframe using id attribute value
        //driver.switchTo().frame("mce_0_ifr");


        //Option #2 passing index number of iframe
        //driver.switchTo().frame(0);//as there is only one iframe, index num is 0

        //option #3 locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        //this gives exception such as NoSuchElementException: no such element:

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to do verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());




    }
}
