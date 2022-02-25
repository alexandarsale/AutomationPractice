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

    public void getWishListProductsBtn(){
        click(wishlistProductsBtn);
    }

    //Get products add in wishlist and print the text
    public void getProducts(){
        for (WebElement boughtProduct : boughtProducts) {
            System.out.println("Products in wishlist " + "are " + boughtProduct.getText());
        }
    }
}
