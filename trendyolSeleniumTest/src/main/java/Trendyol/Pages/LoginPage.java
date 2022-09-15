package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    ConstantsLoginPage constantsLoginPage = new ConstantsLoginPage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public LoginPage helloTextIsDisplayed(){
        String helloText =  constantsLoginPage.helloText.getText();
        Assert.assertEquals("Merhaba,", helloText);
        sleep(1);
        return this;
    }

    public LoginPage email(String EnterEmail){
        constantsLoginPage.eMailBox.clear();
        constantsLoginPage.eMailBox.sendKeys(EnterEmail);
        sleep(1);
        return this;
    }

    public LoginPage password(String EnterPasword){
        constantsLoginPage.passwordBox.clear();
        constantsLoginPage.passwordBox.sendKeys(EnterPasword);
        sleep(1);
        return this;
    }

    public LoginPage clickTologinButton(){
        constantsLoginPage.loginBtn2.click();
        System.out.println("Hesaba Başarıyla Giriş Yapıldı.");
        sleep(1);
        return this;
    }

}