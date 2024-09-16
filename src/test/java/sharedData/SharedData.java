package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class SharedData {
    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment(){
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
        LoggerUtility.info("The browser is open with success");
    }

    @AfterMethod
    public void clearEnvironment(){
        driver.quit();
        LoggerUtility.info("The browser is closed with success");
   }

    public WebDriver getDriver() {
        return driver;
    }
}
