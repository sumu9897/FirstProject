package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void  testInteractionofWebElemnet() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");
        WebElement firstNameInputBox = browser.findElement(By.xpath("//input[@id='fname']"));
        firstNameInputBox.sendKeys("Mohammad");
        Thread.sleep(1000);

    }
}
