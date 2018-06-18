package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vasya on 16/06/18.
 */
public class ComputerPage extends PageObject {


    @FindBy (xpath = "//div[@class='catalog-menu__list']//a[text()='Планшеты']")
    private WebElement lblTablet;

    public void click(){
        lblTablet.click();
    }
}
