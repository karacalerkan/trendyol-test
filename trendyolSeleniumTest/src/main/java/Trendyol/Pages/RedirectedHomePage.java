package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsRedirectedHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RedirectedHomePage extends BasePage {

    ConstantsRedirectedHomePage constantsRedirectedHomePage = new ConstantsRedirectedHomePage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public RedirectedHomePage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public RedirectedHomePage myAccountTextIsDisplayed(){
        String myAccountText = constantsRedirectedHomePage.hesabimText.getText();
        Assert.assertEquals("Hesabım", myAccountText);
        sleep(1);
        return this;
    }

    public RedirectedHomePage search(String WhatAreYouLookingFor){
        constantsRedirectedHomePage.searchBox.clear();
        constantsRedirectedHomePage.searchBox.sendKeys(WhatAreYouLookingFor);
        sleep(1);
        return this;
    }

    public RedirectedHomePage clickToSearchButton(){
        constantsRedirectedHomePage.searchBtn.click();
        System.out.println("Ürün Aratıldı.");
        sleep(1);
        return this;
    }

}