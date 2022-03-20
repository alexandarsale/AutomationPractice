package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;

import static org.testng.Assert.assertTrue;

public class CreateNewAccTest extends BaseTest {

    @Test(testName = "Open site and sign up with valid credentials")
    public static void signUpTest() throws InterruptedException {

        HomePage home = new HomePage(DriverManager.getDriver());

        //Assert home page is opened and click signIn btn
        assertTrue(home.isOpened());

        home.clickOnSignUpButton();

        AuthenticationPage auPage = new AuthenticationPage(DriverManager.getDriver());

        //Assert AuthenticationPage is opened, enter email for signUp and click CreateBtn
        assertTrue(auPage.isOpened());

        auPage.enterRandomEmail();

        auPage.clickCreateAccButton();

        CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());

        //Assert CreateAccountPage is opened
        assertTrue(createAccountPage.isOpened());

        //Enter Personal data
        createAccountPage.setPersonalData();

        /* Adding Company and Address information */
        createAccountPage.setAddressData();

        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

        //Assert that u have succesfully created a new acc
        assertTrue(myAccountPage.isOpened());

    }
}
