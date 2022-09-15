package Trendyol.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;

public class BasePage {

    public WebDriver driver;

    /////////////// CONSTRUCTOR ///////////////

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /////////////// METHODS ///////////////
    public void switchToNewTab() {
        Set<String> windowAllWindows = driver.getWindowHandles();
        for (String WindoW : windowAllWindows) {
            driver.switchTo().window(WindoW);
        }
    }

    public void sleep (int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}