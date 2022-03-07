package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.*;
import productValidation.ValidateProduct;

import static org.testng.Assert.assertTrue;

public class AddItemsToWishListTest extends BaseTest {

    @Test(testName = "Add specials products to wishList")
    public static void addItemsToWishList() {

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

        //Click on Specials Button and assert that page is opened
        priceDropPage.clickOnSpecialsBtn();

        assertTrue(priceDropPage.isOpened());
        priceDropPage.clickListsBtn();
        priceDropPage.clickWishBtn();

        QuickViewPage quickViewPage = new QuickViewPage(DriverManager.getDriver());

        //Open quickView - menu on first product and add it to wishlist, assert that product is added to wishlist
        assertTrue(quickViewPage.isOpened());
        quickViewPage.clickCloseBtn();
        priceDropPage.clickSecondWishBtn();
        quickViewPage.clickCloseBtn();
        NavigatioBarPage navigatioBarPage = new NavigatioBarPage(DriverManager.getDriver());

        //Open account menu and click on My wishlists, assert that added products are expected products
        navigatioBarPage.clickAccountBtn();
        myAccountPage.clickMyWishlists();
        myAccountPage.clickWishlistProducts();

        //Validate that correct product is added to wishlist
        ValidateProduct validateProduct = new ValidateProduct(DriverManager.getDriver());
        assertTrue(validateProduct.isTextPresent("Printed Chiffon Dress"));
        assertTrue(validateProduct.isTextPresent("Printed Summer Dress"));
    }
}
