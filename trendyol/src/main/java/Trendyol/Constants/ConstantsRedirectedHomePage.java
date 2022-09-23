package Trendyol.Constants;

import Trendyol.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsRedirectedHomePage extends BasePage {

    /////////////// WEB ELEMENTS ///////////////
    public static By hesabimText = By.xpath("//p[text()='Hesabım']");
    public static By searchBox = By.cssSelector("input.vQI670rJ");
    public static By searchBtn = By.cssSelector("i.ft51BU2r");

    /////////////// CONSTRUCTOR ///////////////
    public ConstantsRedirectedHomePage(WebDriver driver){
        super(driver);
    }

}