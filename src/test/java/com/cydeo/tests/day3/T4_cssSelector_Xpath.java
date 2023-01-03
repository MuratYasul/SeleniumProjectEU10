package com.cydeo.tests.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_Xpath {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
   //1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
    //2. Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        //Expected : Reset Password
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

    //3. Verify "Reset password" button text is as expected
        //Expected : Reset password
        //Locating reset password button using class attribute and its value
        //WebElement signInButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //Locating reset password button using value attribute and its value

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

//        String expectedResetButtonText = "Reset password";
//        //Getting the value of the attribute "value"
//        String actualResetButtonText = resetPasswordButton.getText();
//
//        System.out.println("actualResetButtonText = " + actualResetButtonText);
//
//        if (actualResetButtonText.equals(expectedResetButtonText)){
//            System.out.println("Reset password button text verification PASSED!");
//        }else {
//            System.out.println("Reset password button Text Verification FAILED!!!!!");
//        }
//
//
//






    }
}
