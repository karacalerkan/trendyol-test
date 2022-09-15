package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsProductPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy(css = "h1.pr-new-br")
    public WebElement productName;
    @FindBy(xpath = "//div[@class='pr-rnr-sm-p']/span[1]")
    public WebElement score;
    @FindBy(css = "div[class='add-to-basket-button-text']")
    public WebElement addToBasketBtn;
    @FindBy(css = "a>p.link-text")
    public WebElement myBasketBtn;


    /////////////// CONSTRUCTOR ///////////////
    public ConstantsProductPage (WebDriver driver){
        super(driver);
    }

}