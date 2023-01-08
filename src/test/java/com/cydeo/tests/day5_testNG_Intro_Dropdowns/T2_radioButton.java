package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_radioButton {
    public static void main(String[] args) throws InterruptedException {
    //TC #2. RadioButton handling
    //1. Open Chrome Browser
         WebDriver driver = WebDriverFactory.getDriver("Chrome");
         driver.manage().window();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //2. Go to https://practice.cydeo.com/radio_buttons
         driver.get("https://practice.cydeo.com/radio_buttons");
    //3.Click to "Hockey" radio button

        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(2000);
        hockeyRadioBtn.click();

    //4. Verify "Hockey" radio button is selected after clicking
        if (hockeyRadioBtn.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        } else {
            System.out.println("Button is NOT selected. Verification FAILED!!!");
        }


    }
}
