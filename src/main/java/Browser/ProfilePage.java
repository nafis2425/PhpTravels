package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    WebDriver driver = browser.driver;

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"fadein\"]/div[3]/div[2]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input")
    WebElement LastName;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement Phone;

    @FindBy(xpath = "//input[@name='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;

    @FindBy(className = "select2-selection__rendered")
    WebElement Country;

    @FindBy(xpath = "//input[@name='state']")
    WebElement State;

    @FindBy(xpath = "//input[@name='city']")
    WebElement City;

    @FindBy(xpath = "//input[@name='fax']")
    WebElement Fax;

    @FindBy(xpath = "//input[@name='zip']")
    WebElement PostalCode;

    @FindBy(xpath = "//input[@name='address1']")
    WebElement Address;

    @FindBy(css= "button[type='submit']") WebElement updateBTN;

public ProfilePage updateProfile(){

FirstName.clear();
FirstName.sendKeys(info.fName);


//LastName.clear();
//Phone.clear();
//Email.clear();
//Password.clear();
//Country.clear();
//State.clear();
//City.clear();
//Fax.clear();
//PostalCode.clear();
//Address.clear();
//
//FirstName.sendKeys(info.fName);
//LastName.sendKeys(info.LastName);
//Phone.sendKeys(info.Phone);
//Email.sendKeys(info.Email);
//Password.sendKeys(info.PASSWORD);
//Country.sendKeys(info.USERNAME);
//State.sendKeys(info.State);
//City.sendKeys(info.City);
//Fax.sendKeys(info.Fax);
//PostalCode.sendKeys(info.PostalCode);
//Address.sendKeys(info.Address);
//Country.click();
//Country.sendKeys(info.Country);


updateBTN.click();

return PageFactory.initElements(driver, ProfilePage.class);
}



}


