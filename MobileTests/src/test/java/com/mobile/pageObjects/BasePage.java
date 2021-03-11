package com.mobile.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static AppiumDriver driver;

//    AppiumDriver driver;

    @BeforeClass
    public void beforeClass() {
        try {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("platformVersion", "9.0");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            desiredCapabilities.setCapability("appPackage", "com.loginmodule.learning");
            desiredCapabilities.setCapability("appActivity", "com.loginmodule.learning.activities.LoginActivity");
            desiredCapabilities.setCapability("app", "/home/mea/Documents/Bukalapak_pretest/Bukalapak_Pretest_test/MobileTests/drivers/bukalapak.apk");
            desiredCapabilities.setCapability("autoGrantPermissions", "true");

            URL url = new  URL("http://127.0.0.1:4723/wd/hub");

            driver = new AndroidDriver(url ,desiredCapabilities);
            String sessionId = driver.getSessionId().toString();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Caused by : " +e.getCause());
            System.out.println("Message is :" +e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
