package pages;

import components.NavigatioBarComponent;
import org.openqa.selenium.WebDriver;

public class NavigatioBarPage extends BasePage {

    private final NavigatioBarComponent navigatioBarComponent;

    public NavigatioBarPage(WebDriver driver) {
        super(driver);
        navigatioBarComponent = new NavigatioBarComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public void clickAccountBtn() {
        navigatioBarComponent.getAccountBtn();
    }
}
