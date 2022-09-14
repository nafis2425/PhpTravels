import org.testng.annotations.Test;

public class ViewVoucherTest extends TestBase {


    @Test(priority = 1)
    public void test01() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToMyBookings()
                .voucher();
    }

    @Test(priority = 2)
    public void test02() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToMyBookings()
                .voucher()
                .validateTitleVV();
    }
}
