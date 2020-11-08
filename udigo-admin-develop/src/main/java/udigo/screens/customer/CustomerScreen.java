package udigo.screens.customer;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import udigo.core.Driver;


public class CustomerScreen extends CustomerElement {


    private static WebDriver driver;
    private static CustomerScreen INSTANCE;
    private static WebDriverWait wait;

    private CustomerScreen() {
        initCustomerPage();
    }

    public static CustomerScreen getInstance() {
        if (INSTANCE == null || (driver != null && Driver.getDriver() != driver)) {
            INSTANCE = new CustomerScreen();
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

    public void clickAddCustomerBtn() {
        wait.until((ExpectedConditions.visibilityOf(addCustomerBtn)));
        addCustomerBtn.click();
    }

    public void verifyCustomerScreen() {
        wait.until(ExpectedConditions.visibilityOf(firstNameTxt));
        Assert.assertNotNull(firstNameTxt.isDisplayed());
    }

    public void enterUserInformation(String firstNameInput, String lastNameInput, String postCodeInput) {
        wait.until(ExpectedConditions.visibilityOf(firstNameTxt));
        firstNameTxt.sendKeys(firstNameInput);
        wait.until(ExpectedConditions.visibilityOf(lastNameTxt));
        lastNameTxt.sendKeys(lastNameInput);
        wait.until(ExpectedConditions.visibilityOf(postCodeTxt));
        postCodeTxt.sendKeys(postCodeInput);


    }

    public void addCustomer(String firstNameInput, String lastNameInput, String postCodeInput) {
      enterUserInformation(firstNameInput,lastNameInput,postCodeInput);
      clickAddCustomerBtn();
    }


}
