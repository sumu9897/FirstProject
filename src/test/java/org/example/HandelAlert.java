package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandelAlert extends DriverSetup{

    @Test
    public void test_different_alert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());

       // Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText("You successfully clicked an alert"));
        Thread.sleep(2000);
    }
}
