package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vasya on 16/06/18.
 */
public class YandexMarketPage extends PageObject {

    @FindBy (xpath = "//ul[@class='topmenu__list']//a[text() = 'Компьютеры']")
    WebElement lblComputer;

    public void click(){
        lblComputer.click();
    }

}
