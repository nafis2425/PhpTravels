package Browser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HotelPage {
    public static WebDriver driver= browser.driver;
    @FindBy(css = "input[role='searchbox']") WebElement srchBox;
    @FindBy(css= "#checkin") WebElement startDateBox;
    @FindBy(xpath = "//td[contains(text(),'5')])[4]") WebElement startDate;
    @FindBy(css= "#checkout") WebElement endDateBox;
    @FindBy(xpath = "(//td[contains(text(),'8')])[5]") WebElement  endDate;
@FindBy(css = "#submit") WebElement seachBOxSBMT;
@FindBy(xpath = "//li[normalize-space()='Indiana,United States']") WebElement indiana;


public HotelPage validateHotelPresence(){
    Assert.assertEquals(driver.getTitle(),"Search Hotels - PHPTRAVELS", "Title is not matched");
    return PageFactory.initElements(driver, HotelPage.class);

}








public SearchResultPage searchHotel() throws InterruptedException {
//    srchBox.click();
//    Thread.sleep(2000);
//    srchBox.sendKeys("Ind");
//    Thread.sleep(2000);
//    srchBox.sendKeys(Keys.ENTER);
//    Thread.sleep(2000);
//    indiana.click();
//    Thread.sleep(2000);
//    startDateBox.click();
//    Thread.sleep(2000);
//    startDate.click();
//    Thread.sleep(2000);
//    endDateBox.click();
//    Thread.sleep(2000);
//    endDate.click();
//    Thread.sleep(2000);
//    seachBOxSBMT.click();
return PageFactory.initElements(driver, SearchResultPage.class);
}


}
