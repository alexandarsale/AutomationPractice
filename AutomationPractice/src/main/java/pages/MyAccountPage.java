package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class MyAccountPage extends BasePage {

    //This page us used to verify that we are successfully logged in
    @FindBy(css = "p.info-account")
    private WebElement myAccountText;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(myAccountText, driver, PAGE_LOAD_TIMEOUT);
    }
}
