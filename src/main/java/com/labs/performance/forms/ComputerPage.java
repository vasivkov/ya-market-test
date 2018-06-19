package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import com.labs.performance.framework.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends PageObject {

    @FindBy (xpath = "//div[@class='catalog-menu__list']//a[text()='Планшеты']")
    private WebElement lblTablet;

    public void click(){
        Util.clickAndWait(lblTablet);
    }
}
