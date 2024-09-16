package tests;

import objectData.AddCustomerObject;
import org.testng.annotations.Test;
import pages.BankManager;
import pages.HomePage;
import sharedData.SharedData;

public class BankManagerTest extends SharedData {

    @Test
    public void methodTest(){
        HomePage homepage = new HomePage(getDriver());
        homepage.navigateToBankManagerLogin();

        AddCustomerObject testData = new AddCustomerObject("src/test/resources/testData/AddCustomerFormData.json");

        BankManager bankManager = new BankManager(getDriver());
        bankManager.addCustomer(testData);
        bankManager.acceptAlert();
        bankManager.openAccount();
        bankManager.acceptAlert();
        bankManager.customersList();
    }
}
