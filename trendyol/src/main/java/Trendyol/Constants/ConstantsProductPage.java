package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsProductPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By productName = By.cssSelector("h1.pr-new-br");
    public static By score = By.xpath("//div[@class='pr-rnr-sm-p']/span[1]");
    public static By addToBasketBtn = By.cssSelector("div[class='add-to-basket-button-text']");
    public static By myBasketBtn = By.cssSelector("a>p.link-text");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsProductPage (WebDriver driver){
        super(driver);
    }

}