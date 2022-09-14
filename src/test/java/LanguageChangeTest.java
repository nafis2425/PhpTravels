import org.testng.annotations.Test;

public class LanguageChangeTest extends TestBase

{
@Test
    public void Russia() throws InterruptedException {
    startLoginPage().logIn().changeLanguage();


}



}
