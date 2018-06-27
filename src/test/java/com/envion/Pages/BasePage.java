package com.envion.Pages;

import com.envion.Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver = DriverFactory.getDriver();
    protected static void Wait30Seconds() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
