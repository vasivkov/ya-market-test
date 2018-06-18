import com.labs.performance.forms.*;
import com.labs.performance.framework.BrowserFactory;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by vasya on 16/06/18.
 */
public class YandexMarketTest {

    private static WebDriver driver;
    private String tabletName;

    @BeforeAll
    public static void setup(){
        driver = BrowserFactory.getBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    @Feature("Search tablets with multiple filters on yandex market ")
    public void searchTablets(){
        navigateToTablets();
        searchTabletsWithFilters();
        searchParticularTablet();
    }

    @AfterEach
    public void after() {
        tabletName = null;
    }

    @Step
    private void navigateToTablets() {
        driver.get("http://www.yandex.ru");

        YandexPage yandexPage = new YandexPage();
        yandexPage.click();

        YandexMarketPage yandexMarketPage = new YandexMarketPage();
        yandexMarketPage.click();

        ComputerPage computerPage = new ComputerPage();
        computerPage.click();

        TabletPage tabletPage = new TabletPage();
        tabletPage.showAllFilters();
    }

    @Step
    private void searchTabletsWithFilters() {
        AllTabletFiltersPage allTabletFiltersPage = new AllTabletFiltersPage();
        allTabletFiltersPage.setPriceRange(25000, 30000);
        allTabletFiltersPage.searchLenovoAndAcer();
        allTabletFiltersPage.showAll();

        TabletPage tabletPage = new TabletPage();
        assertTrue(tabletPage.numberOfItems() >= 3);
        this.tabletName = tabletPage.getElement(3);
    }

    @Step
    private void searchParticularTablet() {
        TabletPage tabletPage = new TabletPage();
        tabletPage.search(tabletName);
        ResultPage resultPage = new ResultPage();
        assertEquals(tabletName ,resultPage.getTitle());
    }


    @AfterAll
    public static void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }


}
