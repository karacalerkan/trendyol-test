package Trendyol.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class BasePage {

    public WebDriver driver;

    /////////////// CONSTRUCTOR ///////////////

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /////////////// METHODS ///////////////

    public void sleep(int second){
        try {
            Thread.sleep(second* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendKeys(By by, CharSequence text){
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By by){
        return driver.findElement(by).getText();
    }

    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void assertEquals(String actual, By by){
        String text = driver.findElement(by).getText();
        Assert.assertEquals(actual, text);
    }

    public void scrollToElement(By by){
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void switchToNewTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Yeni Sekmeye geçildi.");
    }
    public void switchToOldTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        sleep(2);
        driver.switchTo().window(tabs.get(1));
        driver.close();
        sleep(2);
        driver.switchTo().window(tabs.get(0));
        sleep(2);
        System.out.println("Önceki Sekmeye geçildi.");
    }
}