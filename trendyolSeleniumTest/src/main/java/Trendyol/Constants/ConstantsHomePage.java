package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsHomePage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy(xpath = "//button[text()='KABUL ET']")
    public WebElement acceptCookiesBtn;
    @FindBy(xpath = "//div[@class='link account-user']//child::p")
    public WebElement loginBtn;

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsHomePage(WebDriver driver) {
        super(driver);
    }

}