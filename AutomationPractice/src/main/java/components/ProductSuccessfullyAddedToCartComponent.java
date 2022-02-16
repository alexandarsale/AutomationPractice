package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ProductSuccessfullyAddedToCartComponent extends BasePage {

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckOutButton;

    public ProductSuccessfullyAddedToCartComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void clickProceedCheckOut(){
        click(proceedToCheckOutButton);
    }

}
