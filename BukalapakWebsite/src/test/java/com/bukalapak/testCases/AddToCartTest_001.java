package com.bukalapak.testCases;

import java.io.IOException;


import com.bukalapak.pageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bukalapak.pageObjects.AddToCart;
import com.bukalapak.pageObjects.LoginPage;

/**
 * This test includes the search product test and add the product to cart after searching it.
 */
public class AddToCartTest_001 extends BaseClass {

    public String product=readconfig.getProduct();

    @Test
    public void addToCartTest() throws IOException, InterruptedException {



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

        AddToCart atc = new AddToCart(driver);

        logger.info("NOW on landing page");

        Thread.sleep(100);

        atc.searchProduct(product);

        atc.searchResult();

        atc.clickElectronicsImage();

        atc.addToCart();

    }
}
