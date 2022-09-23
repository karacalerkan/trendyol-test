package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsLoginPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By helloText = By.xpath("//div[@class='lr-title']//h1");
    public static By eMailBox = By.id("login-email");
    public static By passwordBox = By.id("login-password-input");
    public static By loginBtn2 = By.xpath("(//span[text()='Giriş Yap'])[2]");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsLoginPage(WebDriver driver){
        super(driver);
    }

}