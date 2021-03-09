/*
 * This class stores all the frequently repeated methods for test cases
 * @date calculation: today, tomorrow & formatting to format: MM/DD/YYYY
 *
 */

package com.formsapp._Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import java.text.DateFormat;
import static org.junit.Assert.assertTrue;


public class utils
{

    WebDriver driver;

    By birthdate = By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']");

    public utils(WebDriver driver)
    {
        this.driver=driver;
    }

    public void todayDate() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String todayFormatted = dateFormat.format(new Date());
        //System.out.println(todayFormatted);
        driver.findElement(birthdate).click();
        driver.findElement(birthdate).sendKeys(Keys.HOME);
        driver.findElement(birthdate).sendKeys(todayFormatted);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }

    public void tomorrowDate() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        //System.out.println(tomorrow);
        String tomorrowFormatted = dateFormat.format(new Date(today.getTime() + (1000 * 60 * 60 * 24)));
        //System.out.println(tomorrowFormatted);
        driver.findElement(birthdate).click();
        driver.findElement(birthdate).sendKeys(Keys.HOME);
        driver.findElement(birthdate).sendKeys(tomorrowFormatted);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }

}
