package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SummaryComponent extends BasePage {

    @FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    private WebElement proceedBtn;

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
}
