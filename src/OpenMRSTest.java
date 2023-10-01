import Utility.BaseDriver;
import Utility.MyFunction;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.*;

public class OpenMRSTest {

    public OpenMRSTest() {

        PageFactory.initElements(BaseDriver.driver, this);
    }

    @Test
    public void US3() {

        driver.get("https://openmrs.org/");
        MyFunction.Wait(2);

        _parametreler elements = new _parametreler();

        elements.demo.click();

        new Actions(driver).scrollByAmount(0, 10).build().perform();

        elements.openmrs2.click();

        MyFunction.Wait(2);
        elements.entertheopenmrs2demo.click();

        elements.username.sendKeys("admin");

        elements.password.sendKeys("Admin123");

        elements.Inpatientward.click();

        elements.login.click();

        // elements.logout.click();

        elements.findPatientRecord.click();


        //elements.showingText.click();
        //int sayi = Integer.parseInt(elements.showingText.getText());
        //int showing = (sayi - 1) * 15;
        //int toplam = showing + elements.showingTotal.size();


        // HASTA LİSTELEME :

        //  String showingZ = elements.toplamHasta.getText().substring(13, 14);
        //  int showingToplam = Integer.parseInt(showingZ);
        //  Assert.assertTrue(showingToplam == elements.showingTotal.size(),"Görünen toplam hasta ile kayıtlı hasta eşit değil");


        // HASTA LİSTESİNE ARAMA :

        elements.findPatientSearch.sendKeys("John Green");
        elements.hastaClick.click();
        elements.home.click();
        elements.findPatientRecord.click();
        elements.findPatientSearch.sendKeys("Abuzer Kömürcü");

        String hastaBulunamadi = "No matching records found";
        MyFunction.bekle(3);
        Assert.assertEquals(elements.noMatching.getText(), hastaBulunamadi, "Beklenen mesaj ile alınan mesaj aynı değil.");


        BekleveKapat();
    }

}







