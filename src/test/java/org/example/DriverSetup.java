package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DriverSetup {
    public WebDriver browser;

    @BeforeMethod
    public void openABrowser(){
        browser = new ChromeDriver();
    }

    @AfterMethod
    public void quiteBrowser(){
        browser.close();
    }
}
