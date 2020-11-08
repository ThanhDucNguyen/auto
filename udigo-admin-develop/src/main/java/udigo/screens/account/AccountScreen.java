package udigo.screens.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import udigo.core.Driver;


public class AccountScreen extends AccountElement {


    private static WebDriver driver;
    private static AccountScreen INSTANCE;
    private static WebDriverWait wait;

    private AccountScreen() {
        initCustomerPage();
    }

    public static AccountScreen getInstance() {
        if (INSTANCE == null || (driver != null && Driver.getDriver() != driver)) {
            INSTANCE = new AccountScreen();
        }
        return INSTANCE;
    }

    private void initCustomerPage() {
        Driver.setUpDriver();
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        wait = Driver.getWait();

    }

    public void openWebsite(String website) {
        driver.get(website);
    }


    public void closeWebsite() {
        driver.quit();
        Driver.driver = null;

    }

    public void clickOpenAccount(){
        wait.until(ExpectedConditions.visibilityOf(btnOpenAccount));
        btnOpenAccount.click();
    }




}
