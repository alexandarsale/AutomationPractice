package pages;

import components.TShirtsComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class ShirtsPage extends BasePage{

    private final  TShirtsComponent tShirtsComponent;

    @FindBy(xpath = "//p[contains(text(),'The must have of your wardrobe, take a look at our')]")
    private WebElement tshirtPageText;

    public ShirtsPage(WebDriver driver) {
        super(driver);
        tShirtsComponent = new TShirtsComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(tshirtPageText, driver, PAGE_LOAD_TIMEOUT);
    }

    public void clickOnTShirtButton(){
        tShirtsComponent.tshirtButton();
    }

    public void hoverOverItemAndClickAddToCartButton(){
        tShirtsComponent.hoverOverItem();
    }
}
