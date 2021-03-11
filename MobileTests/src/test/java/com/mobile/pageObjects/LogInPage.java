package com.mobile.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

public class LogInPage extends BasePage {

    public LogInPage(AppiumDriver driver) {
        super();
    }

    public void enterEmail() {

        MobileElement el1 = (MobileElement) driver.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el1.click();
        el1.sendKeys("allantumu1962@gmail.com");
    }

    public void enterPassword(){
        MobileElement el2 = (MobileElement) driver.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el2.click();
        el2.sendKeys("test@bukalapak1");
    }

    public void clickLogin(){
        MobileElement el3 = (MobileElement) driver.findElementById("com.loginmodule.learning:id/appCompatButtonLogin");
        el3.click();
    }

    public void verifyLogin() {
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[1]");
        String loginSuccess = el6.getText();

        if(loginSuccess.equals("Android NewLine Learning"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }

}
