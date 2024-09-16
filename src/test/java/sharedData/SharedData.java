package sharedData;

import loggerUtility.LoggerUtility;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@Getter
public class SharedData {
    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
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
