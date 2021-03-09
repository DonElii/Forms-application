/*
* This class stores all the locators and methods of UserCreation page.
* @url: https://forms.liferay.com/web/forms/shared/-/form/122548
*
 */

package com.formsapp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserCreation
{

    WebDriver driver;

    By username = By.xpath("//input[@class='ddm-field-text form-control']");
    By birthdate = By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']");
    By comment = By.xpath("//textarea[@type='text']");
    By submitButton = By.xpath("//button[@type='submit']");

    public UserCreation(WebDriver driver)
    {
        this.driver=driver;
    }


    public void FormTitle()
    //Explicitly waits for the title of UserCreation page
    {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.titleIs("This is a Liferay Forms"));
        String title = driver.getTitle();
        assertTrue("Title should be: 'This is a Liferay Forms'", (driver.getTitle().contains("This is a Liferay Forms")));

    }


    public void FilltheForm(String userid,String bdate, String comm)
    //Fill the form in one go
    {
        driver.findElement(username).sendKeys(userid);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        driver.findElement(birthdate).sendKeys(Keys.HOME, bdate);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        driver.findElement(comment).sendKeys(comm);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        driver.findElement(submitButton).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }


    //Fill the form one by one via below classes:
    public void typeUserName(String uid)
    {
        driver.findElement(username).sendKeys(uid);
    }


/*  public void typeDate(String bdate)
    //auto adjusting to the beginning of date calculation field.
    //not in use. currently used class: utils/todayDate();

    {
        driver.findElement(birthdate).click();
        driver.findElement(birthdate).sendKeys(Keys.HOME);
        driver.findElement(birthdate).sendKeys(bdate);
    }
*/

    public void typeComment(String comm)
    {
        driver.findElement(comment).sendKeys(comm);
    }


    public void clickOnSubmitButton()
    {
        driver.findElement(submitButton).click();
    }
}
