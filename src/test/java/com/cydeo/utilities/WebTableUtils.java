package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    //Method #1 info:
    //1. Name : returnOrderDate()
    //2. Return type : String
    //3. Arg1 : WebDriver Driver
    //4. Arg2: String costumerName
    //This method should accept a customerName and return the customer order date as a string

    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

      //  String middleName="L";
        //String fullName= "Samuel "+middleName+ " Jackson";
    }
  //  public static String returnOrderDate2(WebDriver driver, String costumerName){
    //  return driver.findElement(By.xpath("//td[.='" + costumerName+ "']/following-sibling::td[3]")).getText();

    //Method #2 Info:
    //. Name = orderVerify()
    //. Return type : void
    //. Arg1 : WebDriver driver
    //. Arg2 : String customerName
    //. Arg3 : String expectedOrderDate
    // This Method should accept aforementioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }


    }
