package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Sign up button element
    @FindBy(css = "a.login")
    private WebElement signUpButton;

    @FindBy(css = "a.login")
    private WebElement homePageLogo;

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(homePageLogo, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    public void clickOnSignUpButton() {
        click(signUpButton);
    }
}
