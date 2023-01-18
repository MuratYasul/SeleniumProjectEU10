package com.cydeo.tests.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XpathLocator {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void xpathLocator(){

        //1. Go to: https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        WebElement searchBar = driver.findElement(By.xpath("//button[@type='submit']"));

        searchBar.sendKeys("Wooden Spoon");


    }
}