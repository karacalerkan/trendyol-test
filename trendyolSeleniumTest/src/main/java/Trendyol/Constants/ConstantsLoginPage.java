package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsLoginPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy (xpath ="//div[@class='lr-title']//h1")
    public WebElement helloText;
    @FindBy(id = "login-email")
    public WebElement eMailBox;
    @FindBy(id ="login-password-input")
    public WebElement passwordBox;
    @FindBy(xpath = "(//span[text()='Giriş Yap'])[2]")
    public WebElement loginBtn2;

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsLoginPage(WebDriver driver){
        super(driver);
    }

}