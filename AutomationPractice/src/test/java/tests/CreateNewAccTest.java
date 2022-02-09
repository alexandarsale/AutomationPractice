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

        assertTrue(home.isOpened());

        home.clickOnSignUpButton();

        AuthenticationPage auPage = new AuthenticationPage(DriverManager.getDriver());

        assertTrue(auPage.isOpened());

        auPage.enterRandomEmail();

        auPage.clickCreateAccButton();

        CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());

        assertTrue(createAccountPage.isOpened());

        createAccountPage.selectGender();
        createAccountPage.enterFirstName();
        createAccountPage.enterLastName();
        createAccountPage.enterPassword();
        createAccountPage.enterBirthDate();
        createAccountPage.clickNewsletter();
        createAccountPage.clickOffers();

        /* Adding Company and Address information */

        createAccountPage.setCompanyName();
        createAccountPage.setAddress();
        createAccountPage.setCity();
        createAccountPage.selectState();
        createAccountPage.setZipCode();
        createAccountPage.enterPhoneNumber();
        createAccountPage.clickRegisterButton();

        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

        assertTrue(myAccountPage.isOpened());

    }
}
