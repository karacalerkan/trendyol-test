package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ConstantsBasketPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By productNameInTheBasket =By.cssSelector("p.pb-item");
    public static By deleteProductFromCartButton1 = By.cssSelector("i.i-trash");
    public static By deleteProductFromCartButton2 = By.xpath("//div[@class='pb-item-remove-confirmation-modal-footer']//div//button[2]");
    public static By myAccountIcon = By.xpath("//div[@class='account-navigation-wrapper']//div//div[@class='link account-user']");
    public static By logoutBtn = By.xpath("//div[@class='account-navigation-wrapper']//div//div[2]//div/button");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsBasketPage(WebDriver driver){
        super (driver);
    }

}