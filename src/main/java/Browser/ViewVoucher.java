package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Browser.dashBoardPage.driver;

public class ViewVoucher {

    public static WebDriver driver= browser.driver;

    public ViewVoucher validateTitleVV(){
        Assert.assertEquals(driver.getTitle(),"Bookings - PHPTRAVELS",
                "Title not found");
        return PageFactory.initElements(driver,ViewVoucher.class);
    }





}
