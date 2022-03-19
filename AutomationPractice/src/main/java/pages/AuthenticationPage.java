package pages;

import components.EmailComponent;
import components.Randomizer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class AuthenticationPage extends BasePage{

    private final EmailComponent emailComponent;
    private final Randomizer randomizer;

    @FindBy(css = "#SubmitCreate")
    private WebElement create_acc_button;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    private WebElement createAccText;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        emailComponent = new EmailComponent(driver);
        randomizer = new Randomizer();
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(createAccText, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    @Override
    public boolean isElementDisplayed() {
        return false;
    }

    public void enterRandomEmail(){
        emailComponent.enterEmail(randomizer.emailRandomizer());
    }

    public void clickCreateAccButton(){
        click(create_acc_button);
    }
}
