package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCheckoutComponent extends BaseComponent {

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement processAddressBtn;

    public AddressCheckoutComponent(WebDriver driver) {
        super(driver);
    }

    public void processBtn() {
        click(processAddressBtn);
    }
}
