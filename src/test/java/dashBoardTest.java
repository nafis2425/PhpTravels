import Browser.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class dashBoardTest extends TestBase{

    @Test (priority = 1)
    public void test01()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .validateTitle(); //test01(First we checked if the title of the page is correct)
    }

    @Test (priority = 2)
    public void test02()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .testWelcome(); //test02(We tested the presence of a particular TEXT in the Dashboard Page)
    }

    @Test (priority = 3)
    public void test03()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToMyBookings(); //test03(We tested if certain links work in the Dashboard page)
    }



    @Test (priority = 4)
    public void test04()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToMyProfile(); //test04(We tested if certain links work in the Dashboard page)
    }

    @Test (priority = 5)
    public void test05()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToCompany(); ////test05(We tested if certain links work in the Dashboard page)
    }                                 ////We used actions like mouse hovering so that we cover that part as well

    @Test (priority = 6)
    public void test06()throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToHotel(); //test06(We tested if certain links work in the Dashboard page)
    }




}
