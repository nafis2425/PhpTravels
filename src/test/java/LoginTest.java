import Browser.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LoginTest extends TestBase{


    @Test
    public void test01() throws InterruptedException {
        startLoginPage()
                .validateLogin();

    }


}
