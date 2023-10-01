import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _parametreler {

    public _parametreler() {
        PageFactory.initElements(BaseDriver.driver, this);
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

    @FindBy(linkText = "Find Patient Record")
    public WebElement findPatientRecord;

    @FindBy(xpath = "//tbody[@role='alert']/tr")
    public List<WebElement> showingTotal;

    @FindBy(xpath = "//a[@tabindex='0'][1]")
    public WebElement showingText;

    @FindBy(css = "[id='patient-search-results-table_info']")
    public WebElement toplamHasta;


    @FindBy(css = "[class='form-control']")
    public WebElement findPatientSearch;


    @FindBy(css = "[class='odd']")
    public WebElement hastaClick;


    @FindBy(css = "[class='icon-home small']")
    public WebElement home;

    @FindBy(css = "[class='dataTables_empty']")
    public WebElement noMatching;

}
