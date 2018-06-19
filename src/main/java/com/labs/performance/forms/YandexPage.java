package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import com.labs.performance.framework.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexPage extends PageObject {

    @FindBy(xpath = "//a[@data-id ='market']")
    private WebElement lblMarket;

    public void click(){
        Util.clickAndWait(lblMarket);
    }
}





