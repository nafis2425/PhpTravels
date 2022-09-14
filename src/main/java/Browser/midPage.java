package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class midPage {

    WebDriver driver= browser.driver;
    @FindBy(xpath = "//button[@id='ACCOUNT']")
    WebElement AccountDropDown;
    @FindBy(linkText = "Customer Login")
    WebElement customerLogin;

    public LoginPage changedToEnglish(){
        AccountDropDown.click();
        customerLogin.click();
        return PageFactory.initElements(driver, LoginPage.class );
    }




}
