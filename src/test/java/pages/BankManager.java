package pages;

import loggerUtility.LoggerUtility;
import objectData.AddCustomerObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BankManager extends BasePage {

    public BankManager(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustomer;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    private WebElement postCode;

    @FindBy(xpath = "//button[text()='Add Customer']")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    private WebElement openAccount;

    @FindBy(id = "userSelect")
    private WebElement userSelect;

    @FindBy(xpath = "//select[@id='userSelect']/option[text()='Valentin Stoica']")
    private WebElement selectCustomer;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement selectCurrency;

    @FindBy(xpath = "//select[@id='currency']/option[@value='Dollar']")
    private WebElement currencyDollar;

    @FindBy(xpath = "//button[text()='Process']")
    private WebElement processButton;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    private WebElement customersButton;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    private WebElement searchCustomer;

    @FindBy(xpath = "//button[@ng-click='deleteCust(cust)']")
    private WebElement deleteCustomer;

    public void addCustomer(AddCustomerObject testData){
        elementMethod.clickElement(addCustomer);
        LoggerUtility.info("The Bank Manager clicked on the Add customer menu");
        elementMethod.fillElement(firstName, testData.getFirstNameValue());
        LoggerUtility.info("The Bank Manager filled in the customer's first name: " + testData.getFirstNameValue());
        elementMethod.fillElement(lastName, testData.getLastNameValue());
        LoggerUtility.info("The Bank Manager filled in the customer's last name: " + testData.getLastNameValue());
        elementMethod.fillElement(postCode, testData.getPostCodeValue());
        LoggerUtility.info("The Bank Manager filled in the customer's postal code: " + testData.getPostCodeValue());
        elementMethod.clickElement(addCustomerButton);
        LoggerUtility.info("The Bank Manager submitted the customer's information");
    }

    public void acceptAlert(){

        Alert waitConfirmButton = driver.switchTo().alert();
        System.out.println(waitConfirmButton.getText());
        waitConfirmButton.accept();
    }

    public void openAccount(){
        elementMethod.waitForElementVisible(openAccount);
        elementMethod.clickElement(openAccount);
        LoggerUtility.info("The Bank Manager clicked on the Open Account menu");
        elementMethod.clickElement(userSelect);
        LoggerUtility.info("The Bank Manager clicked on the customers list");
        elementMethod.clickElement(selectCustomer);
        LoggerUtility.info("The Bank Manager selected from the list the customer: Valentin Stoica");
        elementMethod.clickElement(selectCurrency);
        LoggerUtility.info("The Bank Manager clicked on the currency menu");
        elementMethod.clickElement(currencyDollar);
        LoggerUtility.info("The Bank Manager selected from the currency list: Dollar");
        elementMethod.clickElement(processButton);
        LoggerUtility.info("The Bank Manager clicked on the Process button");
    }

    public void customersList(){
        elementMethod.clickElement(customersButton);
        LoggerUtility.info("The Bank Manager clicked on the Customers menu");
        elementMethod.waitForElementVisible(searchCustomer);
        elementMethod.clickElement(searchCustomer);
        LoggerUtility.info("The Bank Manager clicked on the Search Customer field");
        elementMethod.fillElement(searchCustomer, "Valentin");
        LoggerUtility.info("The Bank Manager wrote in the field the text: Valentin");
        elementMethod.clickElement(deleteCustomer);
        LoggerUtility.info("The Bank Manager successfully deleted the customer: Valentin Stoica");
    }
}
