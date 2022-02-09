package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.AlreadyRegisteredPage;
import pages.HomePage;
import pages.MyAccountPage;

import static org.testng.Assert.assertTrue;

public class SignInWithValidCredentialsTest extends BaseTest {

    @Test(testName = "SignIn with valid credentials")
    public static void signInTest() throws InterruptedException {

        HomePage home = new HomePage(DriverManager.getDriver());

        assertTrue(home.isOpened());

        home.clickOnSignUpButton();

        AlreadyRegisteredPage arPage = new AlreadyRegisteredPage(DriverManager.getDriver());

        assertTrue(arPage.isOpened());

        arPage.enterValidEmail();
        arPage.enterValidPassword();
        arPage.clickLogInButton();

        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

        assertTrue(myAccountPage.isOpened());
    }
}
