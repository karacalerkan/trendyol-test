package Trendyol.Pages;

import Trendyol.Constants.ConstantsHomePage;
import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    ConstantsHomePage constantsHomePage = new ConstantsHomePage(driver);
    
    /////////////// CONSTRUCTOR ///////////////
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////
    public HomePage acceptCookies(){
        constantsHomePage.acceptCookiesBtn.click();
        System.out.println("Çerezler Kabul Edildi.");
        sleep(1);
        return this;
    }

    public HomePage clickToLoginButton(){
        constantsHomePage.loginBtn.click();
        sleep(1);
        return this;
        }

    }