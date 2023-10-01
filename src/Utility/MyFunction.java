package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFunction {


    public static org.testng.Assert Assert;

    public static void Wait(int sn) {

        try {
            Thread.sleep(sn * 1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static int RandomNumber(int limit) {
        return (int) (Math.random() * limit);
    }

    public void KayitHesaplama() {


        return;
    }

    public static void bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
