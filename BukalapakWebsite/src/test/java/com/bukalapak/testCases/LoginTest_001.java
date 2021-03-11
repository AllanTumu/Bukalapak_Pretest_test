package com.bukalapak.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.bukalapak.pageObjects.LoginPage;

public class LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws IOException
    {

        logger.info("URL is opened");

        LoginPage lp=new LoginPage(driver);

        lp.clickSignIn();
        logger.info("clicked sign in on landing page");

        lp.setUserName(username);
        logger.info("Entered username");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        if(pageTitle.equals("Bukalapak"))
        {
            Assert.assertTrue(true);
            logger.info("Login test passed");
        }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
        }

    }
}
