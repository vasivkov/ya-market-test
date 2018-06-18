package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vasya on 17/06/18.
 */
public class ResultPage extends PageObject {

    @FindBy (xpath = ".//div[@class='n-title__text']/h1")
    private WebElement selectedTablet;

    public String getTitle(){
        return selectedTablet.getText();
    }


}
