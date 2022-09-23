package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsProductPage;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public ProductPage printProductName(){
        String productName = getText(ConstantsProductPage.productName);
        System.out.println("Ürünün Adı: "+productName);
        sleep(1);
        return this;
    }

    public ProductPage getProductsScore() {
        scrollToElement(ConstantsProductPage.score);
        String score = getText(ConstantsProductPage.score);
        System.out.println("Ürünün puanı: "+score+"/5");
        sleep(1);
        return this;
    }

    public ProductPage clickToAddToCartButton(){
        scrollToElement(ConstantsProductPage.addToBasketBtn);
        click(ConstantsProductPage.addToBasketBtn);
        System.out.println("Ürün Sepete Eklendi.");
        sleep(1);
        return this;
    }

    public void clickToMyCartButton(){
        click(ConstantsProductPage.myBasketBtn);
        System.out.println("Sepetim Sayfasına Yönlendirildi.");
        sleep(1);
    }

}