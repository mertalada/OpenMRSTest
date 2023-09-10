import Utility.BaseDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Utility.MyFunction;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static Utility.BaseDriver.*;

public class OpenMRSTest extends BaseDriver {


    @Test
    public void US3() {

        _parametreler elements = new _parametreler();

        elements.demo.click();

        new Actions(driver).scrollByAmount(0, 10).build().perform();

        elements.openmrs2.click();
        MyFunction.Wait(1);

        elements.entertheopenmrs2demo.click();
        MyFunction.Wait(1);

        elements.username.sendKeys("admin");

        elements.password.sendKeys("Admin123");

        elements.Inpatientward.click();

        elements.login.click();

        elements.logout.click();

        // US_4 Başlıyooooooo (Musabettin Hazretleri)

        ListParameters listParameters=new ListParameters();

        elements.username.sendKeys("admin");
        MyFunction.Wait(1);

        elements.password.sendKeys("Admin123");
        MyFunction.Wait(1);

        listParameters.locations.get(MyFunction.RandomNumber(6)).click();
        MyFunction.Wait(1);

        elements.login.click();
        MyFunction.Wait(1);






    }

}





