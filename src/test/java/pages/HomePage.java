package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='center']//button[contains(text(),'Customer Login')]")
    private WebElement customerLogin;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement bankManagerLogin;

    public void navigateToCustomerLogin(){
        elementMethod.clickElement(customerLogin);
        LoggerUtility.info("The user clicks on the Customer Login menu");
    }

    public void navigateToBankManagerLogin(){
        elementMethod.clickElement(bankManagerLogin);
        LoggerUtility.info("The manager clicks on the Bank Manager Login menu");
    }
}
