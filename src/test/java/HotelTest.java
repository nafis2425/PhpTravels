import org.testng.annotations.Test;

public class HotelTest extends TestBase{

    @Test
    public void test01() throws InterruptedException {
        startLoginPage()
                .changeLanguage()
                .changedToEnglish()
                .logIn()
                .navigateToHotel()
                .validateHotelTitle();
    }
}