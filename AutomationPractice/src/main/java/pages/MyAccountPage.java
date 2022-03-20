package pages;

import components.MyAccountComponent;
import components.WishListComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class MyAccountPage extends BasePage {

    private final MyAccountComponent myAccountComponent;
    private final WishListComponent wishListComponent;

    //This page us used to verify that we are successfully logged in
    @FindBy(css = "p.info-account")
    private WebElement myAccountText;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        myAccountComponent = new MyAccountComponent(driver);
        wishListComponent = new WishListComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(myAccountText, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    @Override
    public boolean isElementDisplayed() {
        return false;
    }

    public void clickMyWishlists() {
        myAccountComponent.getWishLists();
    }

    public void clickWishlistProducts() {
        wishListComponent.getWishListProductsBtn();
    }

}
