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
        firstName.sendKeys("Mohammad");
        Thread.sleep(1000);

        WebElement lastName = browser.findElement(By.name("lname"));
        lastName.sendKeys("Sumon");
        Thread.sleep(1000);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement text = browser.findElement(By.className("ui-autocomplete-input"));
        text.sendKeys("Class name");
        Thread.sleep(1000);

        WebElement linkText = browser.findElement(By.partialLinkText("Free Access to"));
        System.out.println(linkText.getText());
        Thread.sleep(1000);

//        WebElement openTab = browser.findElement(By.linkText("Open Tab"));
//        openTab.click();
//        Thread.sleep(2000);


        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
        radioButton1.click();
        Thread.sleep(5000);




    }

}
