package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentComponent extends BaseComponent {

    @FindBy(css = "a.bankwire")
    private WebElement payViaBankWire;

    @FindBy(css = "a.cheque")
    private WebElement payViaCheck;

    @FindBy(css = "button.button")
    private WebElement confirmOrderButton;

    public PaymentComponent(WebDriver driver) {
        super(driver);
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
