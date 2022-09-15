package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsProductListPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductListPage extends BasePage {

    ConstantsProductListPage constantsProductListPage = new ConstantsProductListPage(driver);

    /////////////// CONSTRUCTOR ///////////////

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public ProductListPage aboutProductIsDisplayed(){
        String aboutProductText = constantsProductListPage.aboutProduct.getText();
        Assert.assertEquals("laptop", aboutProductText);
        sleep(1);
        return this;
    }

    public ProductListPage brandFilter() {
        constantsProductListPage.selectApple.click();
        sleep(1);
        constantsProductListPage.selectLenovo.click();
        System.out.println("Markalar Filtrelendi.");
        sleep(1);
        return this;
    }

    public ProductListPage listProducts(){
        constantsProductListPage.list.click();
        System.out.println("Ürünler Önerilenlere Göre Sıralandı.");
        sleep(1);
        return this;
    }

    public ProductListPage selectToFirstProduct(){
        constantsProductListPage.firstProduct.click();
        System.out.println("Listedeki İlk Ürün Seçildi.");
        sleep(1);
        switchToNewTab();
        return this;
    }


}