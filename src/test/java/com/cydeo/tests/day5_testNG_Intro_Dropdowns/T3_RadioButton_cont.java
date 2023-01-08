package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) throws InterruptedException {
        //TC #3. RadioButton handling
        //1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        clickAndVerifyRadioButton(driver, "sport", "hockey");
        Thread.sleep(2000);

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "red");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement each :radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+ " is Selected = " + each.isSelected());
                break;


            }
        }

    }






}
