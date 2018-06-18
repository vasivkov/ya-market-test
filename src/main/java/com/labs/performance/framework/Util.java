package com.labs.performance.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by vasya on 18/06/18.
 */
public class Util {
    public static void clickAndWait(WebElement webElement){
        webElement.click();
        waitForJSandJQueryToLoad();
    }

    private static boolean waitForJSandJQueryToLoad() {
        ExpectedCondition<Boolean> jQueryLoad = driver -> {
            try {
                return ((Long) ((JavascriptExecutor) BrowserFactory.getBrowser()).executeScript("return jQuery.active") == 0);
            } catch (Exception e) {
                return true;
            }
        };

        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) BrowserFactory.getBrowser()).executeScript("return document.readyState")
                .toString().equals("complete");
        return BrowserFactory.getWait().until(jQueryLoad) && BrowserFactory.getWait().until(jsLoad);
    }

    public static void waitAndClick(WebElement webElement){
        BrowserFactory.getWait().until((ExpectedConditions.visibilityOf(webElement)));
        webElement.click();
    }
}
