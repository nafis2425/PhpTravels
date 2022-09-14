package Browser;

import Browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.sql.rowset.BaseRowSet;
import javax.swing.*;

public class dashBoardPage {


   public static WebDriver driver= browser.driver;

   @FindBy(css = "a[title='hotels']") WebElement hotelLink;





    @FindBy(css = "#languages")
    WebElement laguageDropdown;

    @FindBy(xpath = "//a[normalize-space()='Russian']")
    WebElement russian;

    @FindBy(xpath = "//a[@class=' waves-effect'][normalize-space()='My Profile']")
    WebElement myProfileBTN;

    @FindBy(xpath = "(//a[contains(@class,'waves-effect')][normalize-space()='My Bookings'])[2]")
    WebElement myBookingsBTN;

    @FindBy(xpath = "(//a[contains(@class,'waves-effect')][normalize-space()='Add Funds'])[2]")
    WebElement addFunds;

    @FindBy(xpath = "//a[@class=' waves-effect'][normalize-space()='Logout'])")
    WebElement logOut;

    public void changeLanguage() throws InterruptedException {
        laguageDropdown.click();
        Thread.sleep(2000);
        russian.click();
    }
    public AddFundPage navigateToAddFunds(){
        addFunds.click();
        return PageFactory.initElements(driver, AddFundPage.class);
    }
    public ProfilePage  navigateToMyProfile(){
        myProfileBTN.click();
    return PageFactory.initElements(driver,ProfilePage.class);
    }
    public MyBookingsPage navigateToMyBookings(){



        myBookingsBTN.click();
    return PageFactory.initElements(driver,MyBookingsPage.class);
    }



    public LoginPage logOut(){
        logOut.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }


    public CompanyPage navigateToCompany(){

        WebElement ele=  driver.findElement(By.xpath("(//a[@class=' waves-effect'][normalize-space()='Company'])[1]"));
        Actions actions= new Actions(driver);

        actions.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("(//a[contains(@class,'waves-effect')][normalize-space()='Terms of Use'])[1]")).click();
        return PageFactory.initElements(driver, CompanyPage.class);



    }

    public HotelPage navigateToHotel (){
        hotelLink.click();

        return PageFactory.initElements(driver,HotelPage.class);

    }

    public dashBoardPage validateTitle(){
        Assert.assertEquals(driver.getTitle(),"Dashboard - PHPTRAVELS",
                "Title not found");
        return PageFactory.initElements(driver,dashBoardPage.class);
    }






}