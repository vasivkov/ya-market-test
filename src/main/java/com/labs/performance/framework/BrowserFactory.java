package com.labs.performance.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vasya on 17/06/18.
 */
public class BrowserFactory {
    private static WebDriver driver;
    private static WebDriverWait webDriverWait;

    public static WebDriver getBrowser(){
        if (driver == null ) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if (webDriverWait == null) {
            webDriverWait = new WebDriverWait(getBrowser(), 10);
        }
        return webDriverWait;
    }
}

