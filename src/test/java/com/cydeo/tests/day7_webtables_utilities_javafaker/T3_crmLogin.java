package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_crmLogin {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }
    @Test
    public void crm_login_test() throws InterruptedException {
        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        Thread.sleep(1000);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        CRM_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");

     //   BrowsersUtils.verifyTitle(driver, "My tasks");
    }
//    @Test
//    public void crm_login_test2() throws InterruptedException {
////2. Goto : https://login1.nextbasecrm.com/
//        driver.get("https://login1.nextbasecrm.com/");
//
//        //calling my utility method to login helpdesk1
//        CRM_Utilities.crm_login(driver);
//        //6. Verify title is as expected
//        // Expected : Portal
//        BrowserUtils.verifyTitle(driver, "My Tasks");
//    }
//    @Test
//    public void crm_login_test3() throws InterruptedException {
////2. Goto : https://login1.nextbasecrm.com/
//        driver.get("https://login1.nextbasecrm.com/");
//
//        //calling my utility method to login helpdesk1
//        CRM_Utilities.crm_login(driver, "/helpdesk1@cybertekschool.com UserUser","UserUser");
//        //6. Verify title is as expected
//        // Expected : Portal
//        // BrowsersUtils.verifyTitle(driver, driver.getTitle());
    }

