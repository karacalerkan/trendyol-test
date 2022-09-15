package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstantsRedirectedHomePage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    @FindBy(xpath = "//p[text()='Hesabım']")
    public WebElement hesabimText;
    @FindBy(xpath = "//input[@class='search-box']")
    public WebElement searchBox;
    @FindBy(className = "search-icon")
    public WebElement searchBtn;

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsRedirectedHomePage(WebDriver driver){
        super(driver);
    }

}