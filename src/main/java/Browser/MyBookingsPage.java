package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBookingsPage  {
    public static WebDriver driver= browser.driver;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/a[1]")
    WebElement Voucher;

    public ViewVoucher voucher() throws InterruptedException{

        Thread.sleep(5000);

        Voucher.click();

        return PageFactory.initElements(driver,ViewVoucher.class);
    }





}
