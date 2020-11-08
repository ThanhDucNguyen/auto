package udigo.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import udigo.core.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class Actions {


    public static void tap(WebElement element) {
        Driver.getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void enter(WebElement element, String value) {
        Driver.getWait().until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    public static void selectFromListByIndex(List<WebElement> listElement, int index) {
        assertTrue(listElement.size() > 0);
        listElement.get(index).click();
    }

    public static void scrollToElement(WebDriver driver, String nameOfElement) {

    }
}
