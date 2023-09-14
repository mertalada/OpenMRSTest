import Utility.BaseDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Utility.MyFunction;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.time.Duration;

import static Utility.BaseDriver.*;

public class OpenMRSTest extends BaseDriver {

    _parametreler elements = new _parametreler();
    ListParameters listParameters=new ListParameters();
    //WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));


    @Test
    public void US3() {

        // Seda'nın yazdığı kısım
        elements.myClick(elements.demo);
        elements.myClick(elements.openmrs2);
        elements.myClick(elements.entertheopenmrs2demo);
        elements.mySendKeys(elements.username,"admin");
        elements.mySendKeys(elements.password,"Admin123");
        elements.myClick(elements.Inpatientward);
        elements.myClick(elements.login);
        elements.myClick(elements.logout);


        // US_4 Başlıyooooooo (Musabettin Hazretleri)

        Select gender=new Select(elements.genderBox);
        Select month=new Select(elements.birthMonth);
        Select relationshipType=new Select(elements.relationBox);

        elements.mySendKeys(elements.username,"admin");
        elements.mySendKeys(elements.password,"Admin123");
        listParameters.myClick(listParameters.locations.get(MyFunction.RandomNumber(6)));
        elements.myClick(elements.login);
        elements.myClick(elements.registerPatient);
        elements.mySendKeys(elements.givenName,"Musabettin");
        elements.myClick(elements.familyName);
        elements.mySendKeys(elements.familyName,"TestHazretleriOğulları");
        elements.myClick(elements.nextButton);
        gender.selectByIndex(1);
        elements.myClick(elements.nextButton);
        elements.mySendKeys(elements.birthDay,"1");
        month.selectByIndex(4);
        elements.mySendKeys(elements.birthYear,"1995");
        elements.myClick(elements.nextButton);
        elements.mySendKeys(elements.adress,"İstanbul");
        elements.mySendKeys(elements.adress2,"Küçükçekmece");
        elements.mySendKeys(elements.cityVillage,"Cumhuriyet");
        elements.mySendKeys(elements.stateProvince,"Marmara");
        elements.mySendKeys(elements.country,"Türkiye");
        elements.mySendKeys(elements.postalCode,"34290");
        elements.mySendKeys(elements.phoneNumber,"+90555555555");
        elements.myClick(elements.nextButton);
        relationshipType.selectByVisibleText("Parent");
        elements.mySendKeys(elements.personName,"Abuzer Kömürcü");
        elements.myClick(elements.nextButton);
        elements.myClick(elements.confirmButton);







        




    }

}





