package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //We are getting the browserType dynamically from our configuration_properties file
        String browserType = ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver(browserType);

     //   driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

        @Test
        public void google_search_test(){
            //3.Write "apple" in search box
            WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
           //googleSearchBox.sendKeys("apple"+ Keys.ENTER);
            googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
            //4.Verify title:
            //Expected : tesla - Google'da Ara
            String expectedTitle= ConfigurationReader.getProperty("searchValue")+" - Google'da Ara";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle);



}
}