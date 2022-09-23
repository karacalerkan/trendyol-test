import Trendyol.Base.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Trendyol.Pages.HomePage;
import Trendyol.Pages.LoginPage;
import Trendyol.Pages.RedirectedHomePage;
import Trendyol.Pages.ProductListPage;
import Trendyol.Pages.ProductPage;
import Trendyol.Pages.BasketPage;

    public class TrendyolTest extends BaseTest{
        HomePage homePage;
        LoginPage loginPage;
        RedirectedHomePage redirectedHomePage;
        ProductListPage productListPage;
        ProductPage productPage;
        BasketPage basketPage;

        @BeforeMethod
        public void installPages(){
            homePage = new HomePage(driver);
            loginPage = new LoginPage(driver);
            redirectedHomePage = new RedirectedHomePage(driver);
            productListPage = new ProductListPage(driver);
            productPage = new ProductPage(driver);
            basketPage = new BasketPage(driver);
        }

        @Test(priority = 1)
        public void trendyolTest(){

                homePage.
                        acceptCookies().clickToLoginButton();

                loginPage.
                        helloTextIsDisplayed().email("qaautomationtestingsamplemail@gmail.com").password("TrendyolSample1").clickTologinButton();

                redirectedHomePage.
                        myAccountTextIsDisplayed().search("laptop").clickToSearchButton();

                productListPage.
                        closeToColorOptions().aboutProductIsDisplayed().brandFilter().listProducts().selectToFirstProduct();

                productPage.
                        printProductName().getProductsScore().clickToAddToCartButton().clickToMyCartButton();

                basketPage.
                        productNameInTheBasket().clearToBasket().logout();

        }

    }