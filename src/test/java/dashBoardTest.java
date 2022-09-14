import Browser.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class dashBoardTest extends TestBase{
    @Test
    public void dashBoardtest() throws InterruptedException {
        startLoginPage()
                .logIn()
                .validateTitle();
    }}
