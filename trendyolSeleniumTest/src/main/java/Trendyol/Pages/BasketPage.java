package Trendyol.Pages;

import Trendyol.Base.BasePage;
import Trendyol.Constants.ConstantsBasketPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasketPage extends BasePage {

    ConstantsBasketPage constantsBasketPage = new ConstantsBasketPage(driver);

    /////////////// CONSTRUCTOR ///////////////
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    /////////////// METHODS ///////////////
    public BasketPage productNameInTheBasket(){
        String productNameInTheBasket = constantsBasketPage.productNameInTheBasket.getText();
        System.out.print("Sepetteki Ürünün Adı : "+productNameInTheBasket);
        return this;
    }

    public BasketPage clearToBasket() throws InterruptedException {
        constantsBasketPage.deleteProductFromCartButton1.click();
        sleep(1);
        constantsBasketPage.deleteProductFromCartButton2.click();
        System.out.println("Sepet Başarıyla Güncellendi.");
        sleep(1);
        return this;
    }

    public BasketPage logout(){
        Actions action = new Actions(driver);
        action.moveToElement(constantsBasketPage.myAccountIcon).build().perform();

        constantsBasketPage.logoutBtn.click();
        System.out.println("Hesaptan Başarıyla Çıkış Yapıldı.");
        sleep(1);
        return this;
        }

    }