package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    WebDriver driver= browser.driver;

    @FindBy(id="username") private static WebElement username;
    @FindBy(id="password") private static WebElement password;
    @FindBy(css=".form-check-input") private static WebElement remember_me;
    @FindBy(id="log-in") private static WebElement sign_in;

    public LoginPage logIn()  {
      username.sendKeys(info.USERNAME);
      password.sendKeys(info.PASSWORD);
      remember_me.click();


        sign_in.click();
      return PageFactory.initElements(browser.driver,LoginPage.class);



    }


}


