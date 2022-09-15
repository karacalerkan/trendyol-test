package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsProductListPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy(xpath = "//h1[text()='laptop']")
    public WebElement aboutProduct;
    @FindBy (css = "select>option[value='SCORE']")
    public WebElement list;
    @FindBy(xpath = "//div[@class='widget-container']//following::div[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//div[text()='Apple']//preceding::div[1]")
    public WebElement selectApple;
    @FindBy(xpath = "//div[text()='LENOVO']//preceding::div[1]")
    public WebElement selectLenovo;


    /////////////// CONSTRUCTOR ///////////////
    public ConstantsProductListPage (WebDriver driver){
        super(driver);
    }

}