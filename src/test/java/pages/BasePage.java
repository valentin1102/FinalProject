package pages;

import helperMethods.ElementMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected ElementMethod elementMethod;


    public BasePage(WebDriver driver){
        this.driver = driver;
        elementMethod = new ElementMethod(driver);
        PageFactory.initElements(driver, this);
    }
}
