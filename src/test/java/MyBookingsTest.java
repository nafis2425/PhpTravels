import org.testng.annotations.Test;

public class MyBookingsTest extends TestBase {


    @Test(priority = 1)
    public void test01() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                    .changedToEnglish()
                        .logIn()
                    .navigateToMyBookings()
                .voucher();
    }
}