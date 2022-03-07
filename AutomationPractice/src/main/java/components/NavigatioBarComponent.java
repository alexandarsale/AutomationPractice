package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NavigatioBarComponent extends BasePage {

    @FindBy(css = "a.account")
    private WebElement accountBtn;

    public NavigatioBarComponent(WebDriver driver) {
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

    public void getAccountBtn(){
        click(accountBtn);
    }
}
