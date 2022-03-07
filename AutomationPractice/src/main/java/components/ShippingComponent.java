package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShippingComponent extends BasePage {

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement processCarrierBtn;

    @FindBy(css = "#cgv")
    private WebElement termsAndConditionsBox;

    public ShippingComponent(WebDriver driver) {
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

    public void carrierBtn() {
        click(processCarrierBtn);
    }

    public void termsAndConditions() {
        click(termsAndConditionsBox);
    }
}
