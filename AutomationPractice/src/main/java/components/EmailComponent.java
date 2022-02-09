package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EmailComponent extends BasePage {

    @FindBy(css = "#email_create")
    private WebElement create_acc_email;

    public EmailComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void enterEmail(String email){
        sendKeys(create_acc_email, email);
    }
}
