import Utility.BaseDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Utility.MyFunction;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static Utility.BaseDriver.*;

public class OpenMRSTest {

    public OpenMRSTest() {

        PageFactory.initElements(BaseDriver.driver,this);
    }
    @Test
    public void US3(){

        driver.get("https://openmrs.org/");
        MyFunction.Wait(2);

        _parametreler elements=new _parametreler();

        elements.demo.click();

        new Actions(driver).scrollByAmount(0, 10).build().perform();

        elements.openmrs2.click();

        elements.entertheopenmrs2demo.click();

        elements.username.sendKeys("admin");

        elements.password.sendKeys("Admin123");

        elements.Inpatientward.click();

        elements.login.click();

        elements.logout.click();

    }



    }





