package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import com.labs.performance.framework.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vasya on 16/06/18.
 */
public class AllTabletFiltersPage extends PageObject {

    @FindBy(id = "glf-pricefrom-var")
    private WebElement minCost;

    @FindBy(id = "glf-priceto-var")
    private WebElement maxCost;

    @FindBy(xpath = ".//*[text() = 'Acer']/../span/input")
    private WebElement chbAcer;

    @FindBy(xpath = ".//*[text() = 'Lenovo']/../span/input")
    private WebElement chbLenovo;

    @FindBy(xpath = ".//span[text()='Показать подходящие']")
    private WebElement btnSelectFilter;

    @FindBy (xpath = ".//span[text() = 'Показать всё']")
    private WebElement showAllModels;

    public void setPriceRange(int min, int max) {
        maxCost.sendKeys(String.valueOf(max));
        minCost.sendKeys(String.valueOf(min));
    }

    public void searchLenovoAndAcer() {
        Util.clickAndWait(showAllModels);
        chbLenovo.click();
        chbAcer.click();
    }

    public void showAll() {
        Util.clickAndWait(btnSelectFilter);
    }
}
