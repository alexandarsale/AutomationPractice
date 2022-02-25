package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SummaryComponent extends BasePage {

    @FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    private WebElement proceedBtn;

    @FindBy(css = "a.cart_quantity_up")
    private WebElement increaseQuantityBtn;

    @FindBy(css = "a.cart_quantity_down")
    private WebElement decreaseQuantityBtn;

    @FindBy(css = "#summary_products_quantity")
    private WebElement productQuantityText;

    public SummaryComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void proceedBtn() {
        click(proceedBtn);
    }

    public void addQuantity() {
        for (int i = 1; i <= 1; i++) {
            click(increaseQuantityBtn);
        }
    }

    public void subtractQuantity() {
        click(decreaseQuantityBtn);
    }
}
