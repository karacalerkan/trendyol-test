package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsBasketPage;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    /////////////// CONSTRUCTOR ///////////////
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////
    public BasketPage productNameInTheBasket(){
        String productNameInTheBasket = getText(ConstantsBasketPage.productNameInTheBasket);
        System.out.println("Sepetteki Ürünün Adı : "+productNameInTheBasket);
        return this;
    }

    public BasketPage clearToBasket(){
        click(ConstantsBasketPage.deleteProductFromCartButton1);
        sleep(1);
        click(ConstantsBasketPage.deleteProductFromCartButton2);
        System.out.println("Sepet Başarıyla Güncellendi.");
        sleep(1);
        return this;
    }

    public void logout(){
        hoverElement(ConstantsBasketPage.myAccountIcon);
        click(ConstantsBasketPage.logoutBtn);
        System.out.println("Hesaptan Başarıyla Çıkış Yapıldı.");
        sleep(1);
    }

}
