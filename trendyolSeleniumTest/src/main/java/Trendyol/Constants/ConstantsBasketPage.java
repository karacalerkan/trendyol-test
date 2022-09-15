package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsBasketPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy(css = "p.pb-item")
    public WebElement productNameInTheBasket;
    @FindBy(css = "button>i.i-trash")
    public WebElement deleteProductFromCartButton1;
    @FindBy (xpath = "//div[@class='pb-item-remove-confirmation-modal-footer']//div//button[2]")
    public WebElement deleteProductFromCartButton2;
    @FindBy (xpath = "//div[@class='account-navigation-wrapper']//div//div[@class='link account-user']")
    public WebElement myAccountIcon;
    @FindBy(xpath = "//div[@class='account-navigation-wrapper']//div//div[2]//div/button")
    public WebElement logoutBtn;

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsBasketPage(WebDriver driver){
        super (driver);
    }

}