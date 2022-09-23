package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsProductListPage;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public ProductListPage closeToColorOptions() {
        click(ConstantsProductListPage.colorOptions);
        sleep(1);
        switchToNewTab();
        switchToOldTab();
        return this;
    }

    public ProductListPage aboutProductIsDisplayed(){
        assertEquals("laptop", ConstantsProductListPage.aboutProduct);
        sleep(1);
        return this;
    }

    public ProductListPage brandFilter() {
        click(ConstantsProductListPage.selectApple);
        sleep(1);
        click(ConstantsProductListPage.selectLenovo);
        System.out.println("Markalar Filtrelendi.");
        sleep(1);
        return this;
    }

    public ProductListPage listProducts(){
        click(ConstantsProductListPage.list);
        System.out.println("Ürünler Önerilenlere Göre Sıralandı.");
        sleep(1);
        return this;
    }

    public void selectToFirstProduct(){
        click(ConstantsProductListPage.firstProduct);
        System.out.println("Listedeki İlk Ürün Seçildi.");
        sleep(1);
        switchToNewTab();
    }

}