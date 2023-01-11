package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    /*
    This method will login with helpdesk1@cybertekschool.com user when it is called
     */
    public static void crm_login (WebDriver driver) throws InterruptedException {
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        Thread.sleep(1000);
        //helpdesk1@cybertekschool.com UserUser
        //helpdesk1@cybertekschool.com UserUser

        //4.Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to 'LogIn' button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    public static void crm_login (WebDriver driver, String userName, String password) throws InterruptedException {
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(userName);

        Thread.sleep(1000);
        //helpdesk1@cybertekschool.com UserUser
        //helpdesk1@cybertekschool.com UserUser

        //4.Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        //5. Click to 'LogIn' button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }
}