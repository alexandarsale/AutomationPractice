package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class WishListComponent extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'My wishlist')]")
    private WebElement wishlistProductsBtn;

    @FindBy(css = "ul.row")
    private List<WebElement> boughtProducts;

    public WishListComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    public void getWishListProductsBtn(){
        click(wishlistProductsBtn);
    }

}
