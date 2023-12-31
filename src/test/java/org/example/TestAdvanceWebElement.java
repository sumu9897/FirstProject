package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");

//        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
//        radioButton1.click();
//        Thread.sleep(1000);
//
//        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
//        selectDropdown.click();
//        Thread.sleep(1000);

        System.out.println(browser.findElement(By.xpath("//div/h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());
    }

}
