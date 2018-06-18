package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vasya on 16/06/18.
 */
public class YandexPage extends PageObject {


    @FindBy(xpath = "//a[@data-id ='market']")
    private WebElement lblMarket;

    public void click(){
        lblMarket.click();
    }
}





