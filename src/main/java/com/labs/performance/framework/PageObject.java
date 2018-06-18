package com.labs.performance.framework;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vasya on 17/06/18.
 */
public class PageObject {
    protected WebDriverWait wait;
    private  static final long TIMEOUT = 5000;

    public PageObject() {
        PageFactory.initElements(BrowserFactory.getBrowser(),this);
        this.wait = new WebDriverWait(BrowserFactory.getBrowser(), TIMEOUT);
    }
}


