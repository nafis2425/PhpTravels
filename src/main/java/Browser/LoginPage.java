package Browser;


import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {


    WebDriver driver = browser.driver;

    //@FindBy(css= ".cookie_stop")  WebElement acceptCookies;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    //@FindBy(xpath="//*[@id=\"fadein\"]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label/text()")
    //WebElement remember_me;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement sign_in;

    @FindBy(css = "#languages")
    WebElement laguageDropdown;

    @FindBy(xpath = "//a[normalize-space()='English']")
    WebElement English;

    public dashBoardPage logIn() throws InterruptedException {


        //driver.findElement(By.xpath("//button[@class='cc-btn cc-dismiss waves-effect']")).click();
        email.sendKeys(info.USERNAME);

        password.sendKeys(info.PASSWORD);
        //remember_me.click();


        sign_in.click();
        Thread.sleep(3000);
        return PageFactory.initElements(driver, dashBoardPage.class);


    }

    public midPage changeLanguage() throws InterruptedException {
        laguageDropdown.click();
        Thread.sleep(2000);
        English.click();
        return PageFactory.initElements(driver,midPage.class);
    }


    public LoginPage validateLogin() {
        Assert.assertEquals(driver.getTitle(), "Login - PHPTRAVELS",
                "Title not found");
        return PageFactory.initElements(driver, LoginPage.class);

    }
}


