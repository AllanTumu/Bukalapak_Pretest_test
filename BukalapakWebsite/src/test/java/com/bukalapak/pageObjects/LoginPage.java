package com.bukalapak.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//p[normalize-space()='Login']")
    @CacheLookup
    WebElement btnLoginBtnHomepage;

    @FindBy(xpath="//input[@id='user_session_username']")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(xpath="//input[@id='user_session_password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//i[@class='c-btn--spinner__icon']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath="//a[@class='sigil-header__nav-link']//div[@class='bl-flex-container align-items-center']")
    @CacheLookup
    WebElement btnLogout;

    public void clickSignIn()
    {
        btnLoginBtnHomepage.click();
    }


    public void setUserName(String uname)
    {
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }


    public void clickSubmit()
    {
        btnLogin.click();
    }

}
