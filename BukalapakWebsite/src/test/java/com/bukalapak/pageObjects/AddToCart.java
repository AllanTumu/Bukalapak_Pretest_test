package com.bukalapak.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

    WebDriver ldriver;

    public AddToCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    JavascriptExecutor js = (JavascriptExecutor) ldriver;

    @FindBy(xpath="//input[@id='v-omnisearch__input']")
    @CacheLookup
    WebElement searchBoxInput;


    @FindBy(xpath="//div[@id='autosuggest__result-item--0']//div[@title='television']")
    @CacheLookup
    WebElement searchResult;

    @FindBy(xpath="//a[contains(text(),'Buku TELEVISION &amp; VIDEO TECHNOLOGY by Eugene T')]")
    @CacheLookup
    WebElement electronicsImage;

    @FindBy(xpath="//body/div[@class='dora']/section[@id='product-explorer-container']/div[@class='bl-container']/div[@class='bl-flex-container']/div[@class='bl-flex-item bl-product-list-wrapper']/div[@class='bl-flex-container direction-column']/div/div/div[@class='bl-flex-container flex-wrap is-gutter-16']/div[6]/div[1]/div[1]/div[2]/div[1]/p[1]/a[1]")
    @CacheLookup
    WebElement productLink;

    @FindBy(xpath="//button[@class='c-main-product__action__cart bl-button bl-button--outline bl-button--medium']")
    @CacheLookup
    WebElement addToCart;

    @FindBy(xpath="//div[@class='multiselect__tags']")
    @CacheLookup
    WebElement dropDown;


//    @FindBy(xpath="//a[normalize-space()='Lanjut ke Pembayaran']")
//    @CacheLookup
//    WebElement confirmButton

    public void clickElectronicsImage() throws InterruptedException {
        Thread.sleep(1000);
        electronicsImage.click();

    }

    public void searchProduct(String product)
    {
        searchBoxInput.sendKeys(product);
    }

    public void searchResult()
    {
        searchResult.click();
    }

    public void clickProductLink() throws InterruptedException {
        Thread.sleep(1000);
        productLink.click();
    }

    public void addToCart()
    {
        WebDriverWait wait = new WebDriverWait(ldriver,20);
        WebElement addPdtCart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(
                        "//button[@class='c-main-product__action__cart bl-button bl-button--outline bl-button--medium']")));
        if (addPdtCart.isDisplayed());
        {
        addToCart.click();
        }


    }

}
