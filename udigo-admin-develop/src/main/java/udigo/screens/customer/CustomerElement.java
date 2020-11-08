package udigo.screens.customer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerElement {


    @FindBy(xpath = "//div[2]/div/div[1]/button[1]")
    protected WebElement addCustomerBtn;

    @FindBy(xpath = "//div[2]/div/div/form/div[1]/input")
    protected WebElement firstNameTxt;


    @FindBy(xpath = "//div[2]/div/div/form/div[2]/input")
    protected WebElement lastNameTxt;

    @FindBy(xpath = "//div[2]/div/div/form/div[3]/input")
    protected WebElement postCodeTxt;



}
