package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{
@Test
    public  void openAPage(){
        //WebDriver browser = new ChromeDriver();
        browser.get("https://niprojmi.com/login");
        //Assert.assertTrue(false);
        //Assert.assertTrue(true);
        //System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(),"Login");
        //Assert.assertEquals(browser.getTitle(), "Home");
       // browser.close();
    }
    @Test
    public  void openAGooglePage(){
        //WebDriver browser = new ChromeDriver();
        browser.get("https://google.com");
        Assert.assertEquals(browser.getTitle(),"Google");

    }


}


