package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsProductPageAfterBasketPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductPageAfterBasketPage extends BasePage {

    ConstantsProductPageAfterBasketPage constantsProductPageAfterBasketPage = new ConstantsProductPageAfterBasketPage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public ProductPageAfterBasketPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////
    public ProductPageAfterBasketPage productNameInTheBasket(){
        String SepettekiUrununAdi = constantsProductPageAfterBasketPage.productNameInTheBasket.getText();
        System.out.print("Sepetteki Ürünün Adı : "+SepettekiUrununAdi);
        return this;
    }

    public ProductPageAfterBasketPage clearToBasket() throws InterruptedException {
        constantsProductPageAfterBasketPage.deleteProductFromCartButton1.click();
        sleep(1);
        constantsProductPageAfterBasketPage.deleteProductFromCartButton2.click();
        System.out.println("Sepet Başarıyla Güncellendi.");
        sleep(1);
        return this;
    }

    public ProductPageAfterBasketPage logout(){
        Actions action = new Actions(driver);
        action.moveToElement(constantsProductPageAfterBasketPage.myAccountIcon).build().perform();

        constantsProductPageAfterBasketPage.logoutBtn.click();
        System.out.println("Hesaptan Başarıyla Çıkış Yapıldı.");
        sleep(1);
        return this;
        }
    }


