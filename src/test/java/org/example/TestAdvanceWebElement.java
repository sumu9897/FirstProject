package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement text = browser.findElement(By.cssSelector(".ui-autocomplete-input"));
        text.sendKeys("Class name");
        Thread.sleep(1000);
        browser.get("https://trytestingthis.netlify.app/");

//        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
//        radioButton1.click();
//        Thread.sleep(1000);
//
//        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
//        selectDropdown.click();
//        Thread.sleep(1000);
        WebElement firstName = browser.findElement(By.cssSelector("#fname"));
        firstName.sendKeys("Mohammad css");
        Thread.sleep(500);
        firstName.clear();
        firstName = browser.findElement(By.xpath("//*[@id='fname']"));
        firstName.sendKeys("Mohammad xpath");
        Thread.sleep(1000);

        System.out.println(browser.findElement(By.xpath("//div/h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());
        //multiple attribute
        System.out.println(browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/\"]")).getText());
        System.out.println(browser.findElement(By.cssSelector("a[class=\"button bar-item\" ][href=\"/\"]")).getText());
        //
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick,\" window.open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google.com',\"]")).getText());
        //
        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick,\"open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick*=\"open('http://google.com',\"]")).getText());
        //
        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());


        System.out.println(browser.findElement(By.cssSelector("tr > th:first-child")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr  > th:last-child")).getText());


        System.out.println(browser.findElement(By.xpath("//td[text()=\"Personal Shopper\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),\"Personal Sh\")]")).getText());

        System.out.println(browser.findElement(By.xpath("//td[contains(text(),\"Bong\")]/preceding-sibling::td")).getText());



    }

    @Test
    public void testEX() throws InterruptedException {
        browser.get("https://www.ebl.com.bd/");
        browser.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        browser.findElement(By.xpath("//a[normalize-space()='Career']")).click();
        Thread.sleep(5000);

    }

    @Test
    public  void eblTG() throws InterruptedException {
        browser.get("https://ebl.com.bd/treasury/government-securities-investment-window");
        browser.findElement(By.xpath("(//tbody/tr)[6]/td[4]")).click();
        System.out.println( browser.findElement(By.xpath("(//tbody/tr)[6]/td[4]")).getText());
        browser.findElement(By.xpath("(//tbody/tr)[4]/td[6]")).click();
        System.out.println( browser.findElement(By.xpath("(//tbody/tr)[4]/td[6]")).getText());

        Thread.sleep(2000);

    }

}
