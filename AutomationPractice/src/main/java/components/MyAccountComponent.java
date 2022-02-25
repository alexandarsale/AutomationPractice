package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MyAccountComponent extends BasePage {

    @FindBy(css = "a[title='My wishlists']")
    private WebElement myWishlists;

    public MyAccountComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void getWishLists(){
        click(myWishlists);
    }
}
