package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class AddSpecialsToCartTest extends BaseTest {

    @Test(testName = "Add specials products to cart and purchase them")
    public static void addSpecialsToCart() {

        HomePage home = new HomePage(DriverManager.getDriver());

        //Assert home page is opened and click signIn btn
        assertTrue(home.isOpened());

        home.clickOnSignUpButton();

        AlreadyRegisteredPage arPage = new AlreadyRegisteredPage(DriverManager.getDriver());

        //Assert login page is opened, enter valid credentials and login
        assertTrue(arPage.isOpened());

        arPage.setLogInData();

        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());

        //Assert that my account page is opened
        assertTrue(myAccountPage.isOpened());

        ShirtsPage shirtsPage = new ShirtsPage(DriverManager.getDriver());

        //Click on T-shirts tab, verify that it is opened and add a product to cart
        shirtsPage.clickOnTShirtButton();

        assertTrue(shirtsPage.isOpened());

        PriceDropPage priceDropPage = new PriceDropPage(DriverManager.getDriver());

        //Click on Specials Button and assert that specials page is opened
        priceDropPage.clickOnSpecialsBtn();

        assertTrue(priceDropPage.isOpened());

        priceDropPage.clickOnFistItemBtn();

        ItemCheckOutPage itemCheckOutPage = new ItemCheckOutPage(DriverManager.getDriver());

        itemCheckOutPage.clickContinueShoppingBtn();
        priceDropPage.clickOnSecondItemBtn();
        itemCheckOutPage.clickProceedCheckOutButton();
        priceDropPage.increaseFirstItem();
        priceDropPage.increaseSecondItem();
        itemCheckOutPage.clickProceedBtn();
        itemCheckOutPage.clickProcessBtn();
        itemCheckOutPage.checkTermsAndConditions();
        itemCheckOutPage.clickCarrierBtn();
        itemCheckOutPage.selectPaymentViaBank();
        itemCheckOutPage.clickConfirmOrderBtn();

        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(DriverManager.getDriver());

        //Assert that order is completed
        assertTrue(orderConfirmationPage.isOpened());
    }
}
