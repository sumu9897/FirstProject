package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestHoverAction extends DriverSetup{

    @Test
    public void testHover() throws InterruptedException {
        browser.get("https://demoqa.com/menu");
        WebElement manu2 = browser.findElement(By.linkText("Main Item 2"));

        Actions actions = new Actions(browser);
        actions.clickAndHold(manu2).build().perform();
        Thread.sleep(5000);
        actions.clickAndHold(browser.findElement(By.linkText("SUB SUB LIST »"))).clickAndHold().build().perform();
        Thread.sleep(5000);
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement mousehover = browser.findElement(By.xpath("//div[@class='mouse-hover']"));

        Actions actions1 = new Actions(browser);
        actions1.scrollByAmount(0, 1000);
        Thread.sleep(1000);
//        actions.scrollToElement(browser.findElement(By.xpath("//legend[text()='Mouse Hover Example']"))).build().perform();
//        WebElement hoverButton = browser.findElement(By.xpath("//*[text()='Mouse Hover']"));
        actions1.clickAndHold(browser.findElement(By.xpath("//*[@id='mousehover']"))).build().perform();
        Thread.sleep(1000);
        actions1.click(browser.findElement(By.linkText("Top"))).build().perform();
        Thread.sleep(1000);

        actions1.sendKeys(browser.findElement(By.id("autocomplete")), "Hello").build().perform();
        actions1.keyDown(Keys.COMMAND);
        actions1.sendKeys("a");
        actions1.keyUp(Keys.COMMAND);
        actions1.build().perform();
        actions1.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
        browser.findElement(By.id("name")).sendKeys(Keys.COMMAND, "v");
        Thread.sleep(5000);

    }
}