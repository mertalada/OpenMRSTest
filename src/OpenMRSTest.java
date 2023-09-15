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
    @Test
    public void TestErdemUS10(){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        WebElement userName= driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("admin");

        WebElement paswrd= driver.findElement(By.xpath("//*[@id='password']"));
        paswrd.sendKeys("Admin123");

        WebElement location= driver.findElement(By.cssSelector("#Inpatient\\ Ward"));
        location.click();

        WebElement logIn= driver.findElement(By.cssSelector("#loginButton"));
        logIn.click();

        MyFunction.Wait(1);

        WebElement appointmentSchedule= driver.findElement(By.cssSelector("#appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension > i"));
        appointmentSchedule.click();

        WebElement manageApp= driver.findElement(By.cssSelector("#appointmentschedulingui-manageAppointments-app > i"));
        manageApp.click();

        WebElement name= driver.findElement(By.cssSelector("#patient-search"));
        name.sendKeys("admin");

        WebElement patientName= driver.findElement(By.cssSelector("#patient-search-results-table > tbody > tr:nth-child(1) > td:nth-child(2)"));
        patientName.click();

    }



    }





