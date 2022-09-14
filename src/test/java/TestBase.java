import Browser.LoginPage;
import Browser.browser;
import Browser.info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = browser.initializeBrowser();
        driver.navigate().to(info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public LoginPage startLoginPage(){

        return PageFactory.initElements(driver,LoginPage.class);
    }

}


