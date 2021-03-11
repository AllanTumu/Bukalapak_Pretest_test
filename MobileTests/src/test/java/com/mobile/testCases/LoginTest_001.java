package com.mobile.testCases;

import com.mobile.pageObjects.BasePage;
import com.mobile.pageObjects.LogInPage;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class LoginTest_001 extends BasePage {

    @Test
    public void logInTests() {
        LogInPage lp = new LogInPage(driver);

        lp.enterEmail();
        driver.hideKeyboard();
        lp.enterPassword();
        driver.hideKeyboard();
        lp.clickLogin();

        lp.verifyLogin();

    }

}
