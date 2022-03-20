package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.AlreadyRegisteredPage;
import pages.ItemCheckOutPage;
import pages.OrderConfirmationPage;
import pages.ShirtsPage;

import static org.testng.Assert.assertTrue;

public class MakeOrderAsGuestTest extends BaseTest {

    @Test(testName = "Open site and make order as guest")
    public static void orderAsGuestTest() {

        ShirtsPage shirtsPage = new ShirtsPage(DriverManager.getDriver());

        //Click on T-shirts tab, verify that it is opened and add a product to cart
        shirtsPage.clickOnTShirtButton();

        assertTrue(shirtsPage.isOpened());

        shirtsPage.hoverOverItemAndClickAddToCartButton();

        ItemCheckOutPage itemCheckOutPage = new ItemCheckOutPage(DriverManager.getDriver());

        //Assert that item is added to cart and checkout page is opened, and make an order
        assertTrue(itemCheckOutPage.isOpened());

        itemCheckOutPage.clickProceedCheckOutButton();
        itemCheckOutPage.clickProceedBtn();

        AlreadyRegisteredPage arPage = new AlreadyRegisteredPage(DriverManager.getDriver());

        //Enter valid credentials and login to proceed checkout
        arPage.setLogInData();

        //Continue with checkout order
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
