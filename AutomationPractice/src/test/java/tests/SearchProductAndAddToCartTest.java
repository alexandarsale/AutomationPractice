package tests;

import Utils.ReadPropertyFile;
import components.ProductListComponent;
import driver.DriverManager;
import enums.ConfigProperties;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class SearchProductAndAddToCartTest extends BaseTest {

    @Test(testName = "Search a product and purchase one product by given price")
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

        //Assert login is successful
        assertTrue(myAccountPage.isOpened());

        //Enter product in searchBox and click on searchBtn

        home.setSearchBox(ReadPropertyFile.getValue(ConfigProperties.PRODUCT));
        home.setSearchBtn();

        //Click On lists button to get a list view of all the products
        PriceDropPage priceDropPage = new PriceDropPage(DriverManager.getDriver());
        priceDropPage.clickListsBtn();

        //Get all prices from products set range between 2 prices and add to cart the one with matching arguments
        ProductListComponent productListComponent = new ProductListComponent(DriverManager.getDriver());
        productListComponent.getProductPrice(Double.parseDouble(ReadPropertyFile.getValue(ConfigProperties.MAXPRICE)),
                Double.parseDouble(ReadPropertyFile.getValue(ConfigProperties.MINPRICE)));

        ItemCheckOutPage itemCheckOutPage = new ItemCheckOutPage(DriverManager.getDriver());

        //Assert that item is added to cart and checkout page is opened, and make an order
        assertTrue(itemCheckOutPage.isOpened());

        itemCheckOutPage.clickProceedCheckOutButton();
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
