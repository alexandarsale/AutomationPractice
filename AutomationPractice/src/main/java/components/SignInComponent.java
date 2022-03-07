package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SignInComponent extends BasePage {

    @FindBy(css = "#email")
    private WebElement registeredEmail;

    @FindBy(css = "#passwd")
    private WebElement registeredPassword;

    @FindBy(css = "#SubmitLogin")
    private WebElement signInButton;

    public SignInComponent(WebDriver driver) {
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

    public void validEmail(String email){
        sendKeys(registeredEmail, email);
    }

    public void validPassword(String pass){
        sendKeys(registeredPassword, pass);
    }

    public void clickSignInButton(){
        click(signInButton);
    }
}
