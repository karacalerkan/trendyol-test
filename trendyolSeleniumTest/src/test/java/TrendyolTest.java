import Trendyol.Base.BaseTest;

import org.testng.annotations.Test;
import Trendyol.Pages.HomePage;
import Trendyol.Pages.LoginPage;
import Trendyol.Pages.RedirectedHomePage;
import Trendyol.Pages.ProductListPage;
import Trendyol.Pages.ProductPage;
import Trendyol.Pages.BasketPage;

    public class TrendyolTest extends BaseTest{

        @Test
        public void testHomePage() throws InterruptedException {
            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            RedirectedHomePage redirectedHomePage = new RedirectedHomePage(driver);
            ProductListPage productListPage = new ProductListPage(driver);
            ProductPage productPage = new ProductPage(driver);
            BasketPage basketPage = new BasketPage(driver);


                homePage.acceptCookies().clickToLoginButton();

                loginPage.helloTextIsDisplayed().email("qaautomationtestingsamplemail@gmail.com").password("TrendyolSample1").clickTologinButton();

                redirectedHomePage.myAccountTextIsDisplayed().search("laptop").clickToSearchButton();

                productListPage.aboutProductIsDisplayed().brandFilter().listProducts().selectToFirstProduct();

                productPage.printProductName().getProductsScore().clickToAddToCartButton().clickToMyCartButton();

                basketPage.productNameInTheBasket().clearToBasket().logout();

        }

    }