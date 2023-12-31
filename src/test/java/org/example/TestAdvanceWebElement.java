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
        //multiple attribute
        System.out.println(browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/\"]")).getText());
        System.out.println(browser.findElement(By.cssSelector("a[class=\"button bar-item\" ][href=\"/\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick,\" window.open('http://google.com',\")]")).getText());


    }

}
