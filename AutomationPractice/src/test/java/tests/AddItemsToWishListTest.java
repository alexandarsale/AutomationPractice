package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import pages.*;

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

        QuickViewPage quickViewPage = new QuickViewPage(DriverManager.getDriver());

        //Open quickView - menu on first product and add it to wishlist, assert that product is added to wishlist
        quickViewPage.clickOnQuickViewBtn();
        quickViewPage.clickWishListBtn();
        assertTrue(quickViewPage.isOpened());
        quickViewPage.clickCloseBtn();

        ItemCheckOutPage itemCheckOutPage = new ItemCheckOutPage(DriverManager.getDriver());

        //Click on second product and add it to wishlist
        quickViewPage.clickContinueBtn();
        quickViewPage.clickMoreBtn();
        quickViewPage.clickWishList();

        NavigatioBarPage navigatioBarPage = new NavigatioBarPage(DriverManager.getDriver());

        //Open account menu and click on My wishlists, assert that added products are expected products
        navigatioBarPage.clickAccountBtn();
        myAccountPage.clickMyWishlists();
        myAccountPage.clickWishlistProducts();
        myAccountPage.wishlistProducts();
    }
}
