package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsLoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public LoginPage helloTextIsDisplayed(){
        assertEquals("Merhaba,", ConstantsLoginPage.helloText);
        sleep(1);
        return this;
    }

    public LoginPage email(String EnterEmail){
        sendKeys(ConstantsLoginPage.eMailBox, EnterEmail);
        sleep(1);
        return this;
    }

    public LoginPage password(String EnterPasword){
        sendKeys(ConstantsLoginPage.passwordBox, EnterPasword);
        sleep(1);
        return this;
    }

    public void clickTologinButton(){
        click(ConstantsLoginPage.loginBtn2);
        System.out.println("Hesaba Başarıyla Giriş Yapıldı.");
        sleep(1);
    }

}