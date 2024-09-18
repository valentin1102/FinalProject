package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CustomerPage extends BasePage {

    public CustomerPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "userSelect")
    private WebElement userSelect;

    @FindBy(xpath = "//option[text()='Harry Potter']")
    private WebElement userName;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    private WebElement depositButton;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement amountField;

    @FindBy(xpath = "//span[text()='Deposit Successful']")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    private WebElement withdrawMenu;

    @FindBy(xpath = "//label[text()='Amount to be Withdrawn :']/following-sibling::input[@ng-model='amount']")
    private WebElement amountWithdraw;

    @FindBy(xpath = "//button[text()='Withdraw']")
    private WebElement withdrawButton;

    @FindBy(xpath = "//span[@ng-show='message' and contains(text(), 'Transaction successful')]")
    private WebElement withdrawSuccessful;

    public void customerDeposit(){
        elementMethod.clickElement(userSelect);
        LoggerUtility.info("The user clicked to select their user from the list");
        elementMethod.clickElement(userName);
        elementMethod.waitForElementVisible(loginButton);
        elementMethod.clickJSElement(loginButton);
        LoggerUtility.info("The user logged in as Harry Potter");
        elementMethod.clickElement(depositButton);
        LoggerUtility.info("The user clicked on the deposit button");
        elementMethod.clickElement(amountField);
        elementMethod.fillElement(amountField, "1000");
        LoggerUtility.info("The user selected to deposit the amount of 1000 dollars");
        elementMethod.pressElement(amountField, Keys.ENTER);
        LoggerUtility.info("The user successfully deposited the amount of 1000 dollars");
        Assert.assertEquals(confirmationMessage.getText(), "Deposit Successful");
        LoggerUtility.info("The deposit of 1000 dollars has been successfully done!");
    }

    public void customerWithdraw()  {
        elementMethod.clickElement(withdrawMenu);
        LoggerUtility.info("The user clicked on the withdraw menu");
        elementMethod.waitForElementVisible(amountWithdraw);
        elementMethod.clickElement(amountWithdraw);
        LoggerUtility.info("The user clicked on the field to input the amount to withdraw");
        elementMethod.fillElement(amountWithdraw, "1000");
        LoggerUtility.info("The user user wrote the amount of 1000 dollars");
        elementMethod.clickElement(withdrawButton);
        LoggerUtility.info("The user clicked on the withdraw button");
        Assert.assertEquals(withdrawSuccessful.getText(), "Transaction successful");
        LoggerUtility.info("The user successfully withdrew 1000 dollars");
    }

}
