package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SummaryComponent extends BasePage {

    @FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    private WebElement proceedBtn;

    @FindBy(css = "a.cart_quantity_up")
    private WebElement increaseQuantityBtn;

    @FindBy(css = "a.cart_quantity_down")
    private WebElement decreaseQuantityBtn;

    @FindBy(css = "#summary_products_quantity")
    private WebElement productQuantityText;

    @FindBy(css = "input.cart_quantity_input")
    private List<WebElement> quantityInput;

    public SummaryComponent(WebDriver driver) {
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

    public void proceedBtn() {
        click(proceedBtn);
    }

    public void addQuantity() {
        for (int i = 1; i <= 1; i++) {
            click(increaseQuantityBtn);
        }
    }

    public void enterQuantity(String quantity){
        sendKeys(quantityInput.get(0), quantity);
    }

    public void subtractQuantity() {
        click(decreaseQuantityBtn);
    }
}
