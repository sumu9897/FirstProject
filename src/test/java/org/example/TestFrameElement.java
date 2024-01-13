package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestFrameElement extends DriverSetup{
    @Test
    public void testFrameItems() throws InterruptedException {
        browser.get("https://www.ebl.com.bd/onlineapply");
        browser.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        Thread.sleep(3000);

    }
}
