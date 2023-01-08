package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDownTest(){
        //3. Verify "Simple dropdown" default selected value is correct
        //Expected : "Please select an option"
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentSelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropDownText= currentSelectedOption.getText();
        String expectedSimpleDropDownText="Please select an option";
        Assert.assertEquals(actualSimpleDropDownText,expectedSimpleDropDownText);

        System.out.println(actualSimpleDropDownText);//it prints "Please select an option"

        //4. Verify "State selection" default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropDownText= "Select a State";
        String actualStateDropDownText=stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State");


        //Expected : "Select a State"




    }
}
