package com.envion.Drivers;

import com.envion.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Authorization class. Class create driver for selected browser
 */
public class DriverFactory {
    static public WebDriver getDriver(){
        WebDriver driver = null;

        String name = System.getProperty("driver");
        if ("firefox".equals(name)){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(Constants.BASE_URL);
        return driver;
    }

}
