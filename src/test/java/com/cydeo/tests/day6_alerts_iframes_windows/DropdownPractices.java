package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    public WebDriver driver;

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
    public void dropdown_task5() throws InterruptedException {
//    //1. Open Chrome browser
//    WebDriver driver = WebDriverFactory.getDriver("Chrome");
//    driver.manage().window();
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    //2. Go to https://practice.cydeo.com/dropdown
//    driver.get("https://practice.cydeo.com/dropdown");

    //we located the dropdown and it is ready to use
    Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
    //Use all Select options. (visible text, value, index)
    //3. Select Illinois
    Thread.sleep(1000);
    stateDropdown.selectByVisibleText("Illinois");

    //4. Select Virginia
    Thread.sleep(1000);
    stateDropdown.selectByValue("VA");

    //5. Select California
    Thread.sleep(1000);
    stateDropdown.selectByIndex(5);//"California"
    //6. Verify final selected option is California
    String expectedOptionText ="California";
    String actualOptionText = stateDropdown.getFirstSelectedOption().getText();
    Assert.assertEquals(actualOptionText, expectedOptionText, "Test passed!");

}
@Test
    public void dropdown_task6(){
    //Select "December 1, 1923" and verify it is selected. Select year using : visibleText,
   Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
   Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
   Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

    //Select year using : visible text
    yearDropdown.selectByVisibleText("1924");

    //Select month using : value attribute
    monthDropdown.selectByValue("11");
    //Select day using : index number
    dayDropdown.selectByIndex(0);

    //creating expected values
    String expectedYear = "1924";
    String expectedMonth= "December";
    String expectedDay  = "1";

    //getting actual values from browser
    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth= monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();

    //creat assertions
    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertEquals(actualMonth,expectedMonth);
    Assert.assertEquals(actualDay,expectedDay);


}
@AfterMethod
    public void teardownMethod(){
        driver.close();
}
}


