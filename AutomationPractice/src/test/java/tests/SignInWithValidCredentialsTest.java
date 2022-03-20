package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.AlreadyRegisteredPage;
import pages.HomePage;
import pages.MyAccountPage;

import static org.testng.Assert.assertTrue;

public class SignInWithValidCredentialsTest extends BaseTest {

    @Test(testName = "SignIn with valid credentials")
    public static void signInTest() {

        HomePage home = new HomePage(DriverManager.getDriver());

        //Assert home page is opened and click signIn btn
        assertTrue(home.isOpened());

        home.clickOnSignUpButton();

        AlreadyRegisteredPage arPage = new AlreadyRegisteredPage(DriverManager.getDriver());

        //Assert login page is opened and log in with valid credentials
        assertTrue(arPage.isOpened());

        arPage.setLogInData();

        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

        //Assert login is successfull
        assertTrue(myAccountPage.isOpened());
    }
}
