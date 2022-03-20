package pages;

import components.SpecialsComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class PriceDropPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'Price drop')]")
    private WebElement priceDropText;

    private final SpecialsComponent specialsComponent;

    public PriceDropPage(WebDriver driver) {
        super(driver);
        specialsComponent = new SpecialsComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(priceDropText, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    public void clickListsBtn(){
        specialsComponent.getListsBtn();
    }

    public void clickWishBtn(){
        specialsComponent.getWishListBtn();
    }

    public void clickSecondWishBtn(){
        specialsComponent.getSecondWishListBtn();
    }

    public void clickOnSpecialsBtn(){
        specialsComponent.getSpecialsBtn();
    }

    public void clickOnFistItemBtn(){
        specialsComponent.getFirstItem();
    }

    public void clickOnSecondItemBtn(){
        specialsComponent.getSecondItem();
    }

    public void increaseFirstItem(){
        specialsComponent.increaseQuantityOfFirstProduct();
    }

    public void increaseSecondItem(){
        specialsComponent.increaseQuantityOfSecondProduct();
    }
}
