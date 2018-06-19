package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexMarketPage extends PageObject {

    @FindBy (xpath = "//ul[@class='topmenu__list']//a[text() = 'Компьютеры']")
    WebElement lblComputer;

    public void click(){
        lblComputer.click();
    }

}
