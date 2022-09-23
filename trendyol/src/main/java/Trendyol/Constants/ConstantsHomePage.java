package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsHomePage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By acceptCookiesBtn = By.xpath("//button[text()='KABUL ET']");
    public static By loginBtn = By.xpath("//div[@class='link account-user']//child::p");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsHomePage(WebDriver driver) {
        super(driver);
    }

}