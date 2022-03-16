package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingComponent extends BaseComponent {

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement processCarrierBtn;

    @FindBy(css = "#cgv")
    private WebElement termsAndConditionsBox;

    public ShippingComponent(WebDriver driver) {
        super(driver);
    }

    public void carrierBtn() {
        click(processCarrierBtn);
    }

    public void termsAndConditions() {
        click(termsAndConditionsBox);
    }
}
