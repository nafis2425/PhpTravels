import org.testng.annotations.Test;


public class updatePageTest extends TestBase{

    @Test
    public void updateProfile() throws InterruptedException {
        startLoginPage()
                .logIn()
                .navigateToMyProfile()
                .updateProfile();
    }
}
