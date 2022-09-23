package Trendyol.Pages;

import Trendyol.Constants.ConstantsHomePage;
import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////
    public HomePage acceptCookies(){
        click(ConstantsHomePage.acceptCookiesBtn);
        System.out.println("Çerezler Kabul Edildi.");
        sleep(1);
        return this;
    }

    public void clickToLoginButton(){
        click(ConstantsHomePage.loginBtn);
        sleep(1);
    }

}