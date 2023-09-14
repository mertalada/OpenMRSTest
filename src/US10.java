import com.sun.glass.events.KeyEvent;
import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

import static sun.management.Agent.getText;

public class US10 extends BaseDriver{

        //Username: admin  Password: Admin123

        @Test
        public void Test(){

                driver.get("https://demo.openmrs.org/openmrs/login.htm");

                WebElement userName= driver.findElement(By.xpath("//*[@id='username']"));
                userName.sendKeys("admin");

                WebElement paswrd= driver.findElement(By.xpath("//*[@id='password']"));
                paswrd.sendKeys("Admin123");

                WebElement location= driver.findElement(By.cssSelector("#Inpatient\\ Ward"));
                location.click();

                WebElement logIn= driver.findElement(By.cssSelector("#loginButton"));
                logIn.click();

                MyFunc.Bekle(1);

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
