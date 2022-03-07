package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ProductSuccessfullyAddedToCartComponent extends BasePage {

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckOutButton;

    @FindBy(css = "span.continue")
    private WebElement continueShoppingBtn;

    public ProductSuccessfullyAddedToCartComponent(WebDriver driver) {
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

    public void clickProceedCheckOut(){
        click(proceedToCheckOutButton);
    }

    public void getContinueShoppingBtn(){
        click(continueShoppingBtn);
    }

}
