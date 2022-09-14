package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFundPage {
    public static WebDriver driver= browser.driver;



    @FindBy (css = "#gateway_stripe")
    WebElement Pay_With_Stripe;

    @FindBy (css = "button[type='submit']")
    WebElement Pay_Now;

    public StripePayment AddFund() throws InterruptedException {

        Pay_With_Stripe.click();

        Thread.sleep(3000);
        Pay_Now.click();
        return PageFactory.initElements(driver,StripePayment.class);


    }}