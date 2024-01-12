package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleSelectTag extends DriverSetup{

    @Test
    public void testDropDown() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");

        WebElement dropdown = browser.findElement(By.id("option"));
        Select select = new Select(dropdown);
        select.selectByValue("option 1");
        Thread.sleep(2000);


    }
}