package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsRedirectedHomePage;
import org.openqa.selenium.WebDriver;

public class RedirectedHomePage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public RedirectedHomePage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public RedirectedHomePage myAccountTextIsDisplayed(){
        assertEquals("Hesabım",ConstantsRedirectedHomePage.hesabimText);
        sleep(1);
        return this;
    }

    public RedirectedHomePage search(String WhatAreYouLookingFor){
        sendKeys(ConstantsRedirectedHomePage.searchBox, WhatAreYouLookingFor);
        sleep(1);
        return this;
    }

    public void clickToSearchButton(){
        click(ConstantsRedirectedHomePage.searchBtn);
        System.out.println("Ürün Aratıldı.");
        sleep(1);
    }

}