package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

        WebElement firstName = browser.findElement(By.id("fname"));
        firstName.sendKeys("Hello World");
        Thread.sleep(5000);
    }

}
