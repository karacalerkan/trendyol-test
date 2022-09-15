package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsLoginPageAfterHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageAfterHomePage extends BasePage {

    ConstantsLoginPageAfterHomePage constantsLoginPageAfterHomePage = new ConstantsLoginPageAfterHomePage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public LoginPageAfterHomePage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public LoginPageAfterHomePage myAccountTextIsDisplayed(){
        String myAccountText = constantsLoginPageAfterHomePage.hesabimText.getText();
        Assert.assertEquals("Hesabım", myAccountText);
        sleep(1);
        return this;
    }
    public LoginPageAfterHomePage search(String WhatAreYouLookingFor){
        constantsLoginPageAfterHomePage.searchBox.clear();
        constantsLoginPageAfterHomePage.searchBox.sendKeys(WhatAreYouLookingFor);
        sleep(1);
        return this;
    }
    public LoginPageAfterHomePage clickToSearchButton(){
        constantsLoginPageAfterHomePage.searchBtn.click();
        System.out.println("Ürün Aratıldı.");
        sleep(1);
        return this;
    }

}

