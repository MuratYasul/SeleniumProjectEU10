package com.cydeo.tests.day4_findElements;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
      //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
      //TC #1: XPATH and cssSelector Practices
      //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

      //2. Go to https://practice.cydeo.com/forgot_password
      driver.get("https://practice.cydeo.com/forgot_password");

      //3. Locate all the WebElements on the page using XPATH and/or CSS
      //locator only (total of 6)
      //a. "Home" link
        //Locate homeLink using cssSelector
        WebElement homelink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector #2
        WebElement homelink_ex2= driver.findElement(By.cssSelector("a.nav-link"));


        //Locate homeLink using cssSelector href value #3
        WebElement homelink_ex3= driver.findElement(By.cssSelector("a[href='/']"));

        //b. "Forgot password" header
        //Locate header using cssSelector : locator parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example >h2"));

        //locate header using xpath, and using web element text"Forgot Password"
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

      //c. "E-mail" text
        WebElement emaillabel = driver.findElement(By.xpath("//label[@for=\"email\"]"));
        emaillabel.click();
      //d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        inputBox_ex1.click();

      //locate input box using xpath contains method

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@name=\"email\"]"));

      //tagName[contains@attribute, 'value']
        WebElement inputBox_ex3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
        inputBox_ex3.click();

        //e. "Retrieve password" button
        //button[@type='submit']
        //button[@class='radius']

        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

      //f. "Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

      //4. verify all web elements are displayed
        System.out.println("homelink_ex1.isDisplayed() = " + homelink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emaillabel.isDisplayed() = " + emaillabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
    }
}
