package com.cydeo.tests.day3_cssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

//TC #3: NextBaseCRM, locators, getText(), getAttribute() practice

        //1. Open a Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2. Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Verify "Log in" button text as expected
        //Expected:Log in

        //LOCATING THE SAME WEB ELEMENT USING DİFFERENT ATTRIBUTE VALUES.
        //                          tagName[attribute='value']
        //                          input[class='login-btn]

        //WebElement signInButton = driver.findElement(By.className("login-btn"));

        //LOCATED USING CLASS ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //LOCATED USING TYPE ATTRIBUTE
        //WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //LOCATED USING VALUE ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification PASSED!");
        }else {
            System.out.println("Log In Button Text Verification FAILED!!!!!");
        }




    }
}
