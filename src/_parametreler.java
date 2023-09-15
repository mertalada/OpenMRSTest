import Utility.BaseDriver;
import Utility.Parent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _parametreler  extends Parent {

    public _parametreler() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demo;
    @FindBy(xpath = "//*[text()='Explore OpenMRS 2']")
    public WebElement openmrs2;
    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[4]")
    public WebElement entertheopenmrs2demo;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='Inpatient Ward']")
    public WebElement Inpatientward;
    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement login;
    @FindBy(xpath = "//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']")
    public WebElement logout;
    @FindBy (xpath = "//*[contains(@id,'register')]/i")
    public WebElement registerPatient;

    // Register A Patient menusundeki elementler
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy(name = "familyName")
    public WebElement familyName;
    @FindBy(id = "gender-field")
    public WebElement genderBox;
    @FindBy(css = "button[id='next-button']>icon")
    public WebElement nextButton;
    @FindBy(css = "input[id='birthdateDay-field']")
    public WebElement birthDay;
    @FindBy(css = "select[id='birthdateMonth-field']")
    public WebElement birthMonth;
    @FindBy(css = "input[id='birthdateYear-field']")
    public WebElement birthYear;
    @FindBy(css = "input[id='address1']")
    public WebElement adress;
    @FindBy(css = "input[id='address2']")
    public WebElement adress2;
    @FindBy(css = "input[id='cityVillage']")
    public WebElement cityVillage;
    @FindBy(css = "input[id='stateProvince']")
    public WebElement stateProvince;
    @FindBy(css = "input[id='country']")
    public WebElement country;
    @FindBy(css = "input[id='postalCode']")
    public WebElement postalCode;
    @FindBy(css = "input[name='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(css = "select[id='relationship_type']")
    public WebElement relationBox;
    @FindBy(css = "input[placeholder='Person Name']")
    public WebElement personName;
    @FindBy(css = "input[id='submit']")
    public WebElement confirmButton;
    @FindBy(css = "span[class='PersonName-givenName']")
    public WebElement patientGivenName;
    @FindBy(css = "li[class='nav-item identifier']>i")
    public WebElement adminMenu;
    @FindBy(linkText = "My Account")
    public WebElement myAccount;
    @FindBy(linkText = "Change Password")
    public WebElement changePassword;
    @FindBy(linkText = "My Languages")
    public WebElement myLanguages;

}
