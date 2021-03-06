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
import java.util.Set;
import java.util.List;

import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
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

        //Fill the birthdate with valid date

        //Submit the form

    }
}