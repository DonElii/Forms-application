/*
 * This class stores all the locators and methods of submission page once UserCreation completed.
 * @url: https://forms.liferay.com/web/forms/shared/-/form/122548
 *
 */

package com.formsapp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserCreation_Submitted
{

    WebDriver driver;

    By username = By.xpath("//input[@class='ddm-field-text form-control']");
    By birthdate = By.xpath("//div//input[@class='form-control input-group-inset input-group-inset-after']");
    By comment = By.xpath("//textarea[@type='text']");
    By submitButton = By.xpath("//button[@type='submit']");

    public UserCreation_Submitted(WebDriver driver)
    {
        this.driver=driver;
    }

    public void SubmittedTitle()
            //Explicitly waits for the title of Submission page
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Form - Forms"));
    }

    public void 

    String actualString = driver.findElement(By.xpath("//h1[@class='ddm-form-name']")).getText();


}
}
