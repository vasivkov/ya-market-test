package com.labs.performance.forms;

import com.labs.performance.framework.PageObject;
import com.labs.performance.framework.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TabletPage extends PageObject {

    @FindBy(xpath = ".//div[@id='search-prepack']//*[text()='Перейти ко всем фильтрам']")
    private WebElement lblAllFilters;

    @FindBy (xpath = ".//*[@class='n-snippet-card2__title']/a")
    private List<WebElement> tablets;

    @FindBy(id = "header-search")
    private WebElement searchLine;

    public void showAllFilters() {
        Util.waitAndClick(lblAllFilters);
    }

    public int numberOfItems(){
        return tablets.size();
    }

    public String getElement(int number){
        return tablets.get(number).getText();
    }

    public void search (String str){
        searchLine.sendKeys(str);
        searchLine.submit();

    }
}