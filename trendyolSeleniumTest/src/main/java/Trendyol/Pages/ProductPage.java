package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsProductPage;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    ConstantsProductPage constantsProductPage = new ConstantsProductPage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////

    public ProductPage printProductName(){
        String productName = constantsProductPage.productName.getText();
        System.out.println("Ürünün Adı: "+productName);
        sleep(1);
        return this;
        }

    public ProductPage getProductsScore() {
        String score = constantsProductPage.score.getText();
        System.out.println("Ürünün puanı: "+score+"/5");
        sleep(1);
        return this;
    }

    public ProductPage clickToAddToCartButton(){
        constantsProductPage.addToBasketBtn.click();
        System.out.println("Ürün Sepete Eklendi.");
        sleep(1);
        return this;
    }

    public ProductPage clickToMyCartButton(){
        constantsProductPage.myBasketBtn.click();
        System.out.println("Sepetim Sayfasına Yönlendirildi.");
        sleep(1);
        return this;
    }


}