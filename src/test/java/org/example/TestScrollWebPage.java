package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class TestScrollWebPage extends DriverSetup{

    @Test
    public void testScroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js =(JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(3000);

    }
}
