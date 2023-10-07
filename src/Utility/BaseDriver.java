package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BaseDriver{
    public static WebDriver driver;
    public static WebDriver wait;

    static { // public static void DriverBaslatma()

        Logger logger = Logger.getLogger("");//output yapılan logları al.
        logger.setLevel(Level.SEVERE);//SADECE ERRORLARI GÖSTER


        driver = new ChromeDriver();
        driver.get("https://openmrs.org/");
        driver.manage().window().maximize();//ekranı maxx yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));//20 sn mühlet: sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));


    }
    @AfterClass
    public static void BekleveKapat() {
        MyFunction.Wait(1);
        driver.quit();
    }

    public static int RandomNumber(int limit){
        return  (int)(Math.random()*limit);}
}
