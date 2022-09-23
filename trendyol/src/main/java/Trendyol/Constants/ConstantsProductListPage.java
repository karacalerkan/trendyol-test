package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsProductListPage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By colorOptions = By.cssSelector("div.overlay");
    public static By aboutProduct = By.xpath("//h1[text()='laptop']");
    public static By list = By.cssSelector("select>option[value='SCORE']");
    public static By firstProduct = By.xpath("//div[@class='widget-container']//following::div[1]");
    public static By selectApple = By.xpath("//div[text()='Apple']//preceding::div[1]");
    public static By selectLenovo = By.xpath("//div[text()='LENOVO']//preceding::div[1]");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsProductListPage (WebDriver driver){
        super(driver);
    }

}