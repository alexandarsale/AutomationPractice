package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AddressCheckoutComponent extends BasePage {

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement processAddressBtn;

    public AddressCheckoutComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void processBtn(){
        click(processAddressBtn);
    }
}
