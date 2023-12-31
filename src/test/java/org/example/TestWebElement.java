package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement(){
        browser.get("https://trytestingthis.netlify.app/");
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());
    }

}
