package org.example;

import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void  testInteractionofWebElemnet(){
        browser.get("https://trytestingthis.netlify.app/");

    }
}
