package pages;

import Utils.ReadPropertyFile;
import components.SignInComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class AlreadyRegisteredPage extends BasePage {

    private final SignInComponent signInComponent;

    @FindBy(xpath = "//h3[contains(text(),'Already registered?')]")
    private WebElement signInText;

    public AlreadyRegisteredPage(WebDriver driver) {
        super(driver);
        signInComponent = new SignInComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(signInText, driver, PAGE_LOAD_TIMEOUT);
    }

    public void enterValidEmail() {
        signInComponent.validEmail(ReadPropertyFile.getValue("email"));
    }

    public void enterValidPassword() {
        signInComponent.validPassword(ReadPropertyFile.getValue("password"));
    }

    public void clickLogInButton() {
        signInComponent.clickSignInButton();
    }
}
