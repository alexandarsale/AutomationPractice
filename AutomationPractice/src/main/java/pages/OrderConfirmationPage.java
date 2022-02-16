package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class OrderConfirmationPage extends BasePage{

    @FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
    private WebElement orderConfirmationText;

    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(orderConfirmationText, driver, PAGE_LOAD_TIMEOUT);
    }
}
