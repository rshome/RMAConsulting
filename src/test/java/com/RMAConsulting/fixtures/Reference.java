package com.RMAConsulting.fixtures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by rshome on 20/02/2017.
 */
public class Reference {

    public static String baseUrl = "http://www.rma-consulting.com/";
    public static WebDriver driver;

    public void Initialize()
    {
        driver = new FirefoxDriver();
    }

    public void Exit()
    {
        driver.quit();
    }

    public void GoToUrl()
    {
        driver.navigate().to(baseUrl);
    }

    public void MaxWindow()
    {
        driver.manage().window().maximize();
    }

    public void ClearCookies()
    {
        driver.manage().deleteAllCookies();
    }

    public void Wait()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
