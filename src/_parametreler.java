import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _parametreler  {

    public _parametreler() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demo;

    @FindBy(xpath = "//*[text()='Explore OpenMRS 2']")
    public WebElement openmrs2;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
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


}
