package tests;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.HomePage;
import sharedData.SharedData;

public class CustomerDepositTest extends SharedData {

    @Test
    public void metodaTest() {
        HomePage homepage = new HomePage(getDriver());
        homepage.navigateToCustomerLogin();

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.customerDeposit();
        customerPage.customerWithdraw();
        customerPage.transactionsCustomerMenu();


    }
}
