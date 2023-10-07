import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStorys extends BaseDriver {

    ElementsPage elements = new ElementsPage();
    Parent listParameters=new Parent();

    @Test
    public void Login_Errors(){

    }
    @Test
    public void Login(){

    }
    @Test
    public void Logout() {

        elements.myClick(elements.demo);
        elements.myClick(elements.openmrs2);
        elements.myClick(elements.entertheopenmrs2demo);
        elements.mySendKeys(elements.username, "admin");
        elements.mySendKeys(elements.password, "Admin123");
        elements.myClick(elements.Inpatientward);
        elements.myClick(elements.login);
        elements.myClick(elements.logout);
    }
    @Test
    public void Patient_Registration(){

        elements.mySendKeys(elements.username, "admin");
        elements.mySendKeys(elements.password, "Admin123");
        listParameters.myClick(listParameters.locations.get(MyFunction.RandomNumber(6)));
        elements.myClick(elements.login);
        elements.myClick(elements.registerPatient);
        elements.mySendKeys(elements.givenName, "Musabettin");
        elements.myClick(elements.familyName);
        elements.mySendKeys(elements.familyName, "TestHazretleriOğulları");
        elements.myClick(elements.nextButton);
        elements.myClick(elements.genderBox);
        Select gender = new Select(elements.genderBox);
        gender.selectByIndex(1);
        elements.myClick(elements.nextButton);
        elements.mySendKeys(elements.birthDay, "1");
        elements.myClick(elements.birthMonth);
        Select month = new Select(elements.birthMonth);
        month.selectByIndex(4);
        elements.mySendKeys(elements.birthYear, "1995");
        elements.myClick(elements.nextButton);
        elements.mySendKeys(elements.adress, "İstanbul");
        elements.mySendKeys(elements.adress2, "Küçükçekmece");
        elements.mySendKeys(elements.cityVillage, "Cumhuriyet");
        elements.mySendKeys(elements.stateProvince, "Marmara");
        elements.mySendKeys(elements.country, "Türkiye");
        elements.mySendKeys(elements.postalCode, "34290");
        elements.myClick(elements.nextButton);
        elements.mySendKeys(elements.phoneNumber, "+90555555555");
        elements.myClick(elements.nextButton);
        Select relationshipType = new Select(elements.relationBox);
        relationshipType.selectByVisibleText("Parent");
        elements.mySendKeys(elements.personName, "Abuzer Kömürcü");
        elements.myClick(elements.nextButton);
        elements.myClick(elements.confirmButton);
        elements.verifyContainsText(elements.patientGivenName, elements.givenName.getText());
    }
    @Test
    public void MyAccount(){

        elements.myClick(elements.demo);
        elements.myClick(elements.openmrs2);
        elements.myClick(elements.entertheopenmrs2demo);
        elements.mySendKeys(elements.username,"admin");
        elements.mySendKeys(elements.password,"Admin123");
        elements.myClick(elements.Inpatientward);
        elements.myClick(elements.login);
        elements.myHover(elements.adminMenu);
        elements.verifyContainsText(elements.myAccount, elements.myAccount.getText());
        elements.myClick(elements.myAccount);
        elements.verifyContainsText(elements.changePassword,elements.changePassword.getText());
        elements.verifyContainsText(elements.myLanguages,elements.myLanguages.getText());
    }
    @Test
    public void Search_On_The_Patient_List(){

    }
    @Test
    public void Patient_Deletion(){

    }
    @Test
    public void Patient_List(){
        WebElement anasayfa = driver.findElement(By.xpath("//i[@class='icon-home small']"));
        anasayfa.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement findPatient = driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
        findPatient.click();

        WebElement findPageControl = driver.findElement(By.xpath("//div[@id='content']/h2"));
        Assert.assertTrue(findPageControl.getText().equals("Find Patient Record"));

        int i = 0;
        int ToplamHasta = 0;

        do {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            WebElement ToplamHastaSayisi = driver.findElement(By.xpath("//div[@id='patient-search-results-table_info']"));

            String[] bosluk = ToplamHastaSayisi.getText().split(" ");
            ToplamHasta = Integer.parseInt(bosluk[5]);

            List<WebElement> satirSayisi = driver.findElements(By.xpath("//tbody[@role='alert']/tr"));

            for (WebElement e : satirSayisi) {
                i++;
            }

            if (ToplamHasta == i) {
                break;
            }

            MyFunction.Wait(1);
            WebElement next = driver.findElement(By.xpath("//a[@id='patient-search-results-table_next']"));
            next.click();
        }
        while (i != ToplamHasta);


        Assert.assertTrue(i == ToplamHasta);
    }
    @Test
    public void Combining_Patient_Records(){

    }
    @Test
    public void The_Wrong_Time_Zone_When_You_Make_a_Patient_Appointment(){

    }


}





