/*
 * This test case verifies the submitting of UserCreation page if the Birthdate is valid.
 * @author: Zoltán Liptai (example ID: ABC123)
 * @ide: IntelliJ IDEA v2020.2.3
 * @framework: JUnit v4.13
 */

package com.formsapp.Testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.formsapp.Pages.UserCreation;
import com.formsapp.Pages.UserCreation_Submission;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UserCreation_ValidBirthdate {

    WebDriver driver;
    Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        //options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void UserCreation_ValidBirthdate_test() throws InterruptedException {

        //navigate to the URL
        driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
        //maximize the window
        driver.manage().window().maximize();

        //Page Object Model @form for UserCreation Page
        UserCreation form = new UserCreation(driver);

        //This is quicker way the fill the full Form and submit it. Currently using the below classes.
        //form.FilltheForm("Test User_1", "11/11/2010", "Test purpose @+'200' ");

        //Fill the User name
        form.typeUserName("Test User");
        Thread.sleep(1000);

        //Fill Birthdate
        form.typeDate("10102010");
        Thread.sleep(1000);

        //Fill the comment field
        form.typeComment("Testing Purpose & spec character test: '@%!+' 10/10 ");
        Thread.sleep(1000);

        //Wait timer before submission
        Thread.sleep(1500);

        //Submit the form
        form.clickOnSubmitButton();

        //Page Object Model @submission for UserCreation_Submitted Page
        UserCreation_Submission submission = new UserCreation_Submission(driver);

        //Explicitly waits for the title of Submission page
        submission.SubmissionTitle();

        //Asserting if submission text = "Information sent"
        submission.SubmissionText("Information sent");

        //Asserting if submission text = "Information sent successfully!"
        submission.SubmissionDescription("Information sent successfully!");

        //Optional wait time to see the submission text & description before quitting
        Thread.sleep(4000);
    }
}
