package com.cydeo.tests.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","\"C:\\Users\\m_yas\\Desktop\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.setProperty("WebDriver.edge.driver","\"C:\\Users\\m_yas\\Desktop\\msedgedriver.exe\"");
        WebDriver driver1= new EdgeDriver();
        driver1.get("https://bing.com");


        String expectedTitle= "Google";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("actualTitle = " + actualTitle +  " : expectedTitle = "+expectedTitle);


    }
}
