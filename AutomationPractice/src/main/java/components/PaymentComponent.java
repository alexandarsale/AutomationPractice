package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PaymentComponent extends BasePage {

    @FindBy(css = "a.bankwire")
    private WebElement payViaBankWire;

    @FindBy(css = "a.cheque")
    private WebElement payViaCheck;

    @FindBy(css = "button.button")
    private WebElement confirmOrderButton;

    public PaymentComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void bankPayment() {
        click(payViaBankWire);
    }

    public void checkPayment() {
        click(payViaCheck);
    }

    public void confirmOrder() {
        click(confirmOrderButton);
    }
}
