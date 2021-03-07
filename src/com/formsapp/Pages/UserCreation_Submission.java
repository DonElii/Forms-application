/*
 * This class stores all the locators and methods of submission page once UserCreation Page submitted.
 * @url - after submitting successfully the Form: https://forms.liferay.com/web/forms/shared/-/form/122548
 *
 */

package com.formsapp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class UserCreation_Submission
{

    WebDriver driver;

    By submission_text = By.xpath("//h1[@class='ddm-form-name']");
    By submission_description = By.xpath("//h5[@class='ddm-form-description']");


    public UserCreation_Submission(WebDriver driver)
    {
        this.driver=driver;
    }

    public void SubmissionTitle()
        //Explicitly waits for the title of Submission page
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Form - Forms"));
    }

    public void SubmissionText(String input_text)
        //captures the text of Submission
        //asserting if the text = parameter (input_text)
    {
        String toText = driver.findElement(submission_text).getText();
        assertTrue(toText.contains(input_text));

    }

    public void SubmissionDescription (String input_description)
        //captures the description of Submission
        //asserting if the description = parameter (input_description)
        //optional message also added before the condition
    {
        String toText = driver.findElement(submission_description).getText();
        assertTrue("Description contains: Information sent successfully!", toText.contains(input_description));
    }
}

