package Trendyol.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\trendyol\\drivers\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2); //0-default, 1-Allow, 2-Block
        options.setExperimentalOption("prefs",prefs);

        driver =new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.trendyol.com/");
    }


    @AfterTest
    public static void tearDown() {
        driver.quit();
    }

}
