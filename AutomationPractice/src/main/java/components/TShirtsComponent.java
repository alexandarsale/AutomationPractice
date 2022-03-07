package components;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TShirtsComponent extends BasePage {

    @FindBy(xpath = "//ul[contains(@class,'sf-menu')]/li[3]")
    private WebElement tshirts_button;

    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    private WebElement fadedShortsItem;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;

    public TShirtsComponent(WebDriver driver) {
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

    public void tshirtButton(){
        click(tshirts_button);
    }

    public void hoverOverItem(){
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(fadedShortsItem).perform();
        click(addToCartButton);
    }
}
