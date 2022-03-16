package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigatioBarComponent extends BaseComponent {

    @FindBy(css = "a.account")
    private WebElement accountBtn;

    public NavigatioBarComponent(WebDriver driver) {
        super(driver);
    }

    public void getAccountBtn() {
        click(accountBtn);
    }
}
