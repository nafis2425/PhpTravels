import org.testng.annotations.Test;

public class AddFundTest extends TestBase {


    @Test(priority = 1)
    public void test01() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToAddFunds(); //test01(We tested if certain links work in the Dashboard page)
    }


    @Test(priority = 2)
    public void test02() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToAddFunds()
                .AddFund();//test02(We tested if we can add fund from different payment options)
    }

    @Test(priority = 3)
    public void test03() throws InterruptedException {
        startLoginPage();
    }
}

