package productValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class ValidateProduct extends BasePage {

    public ValidateProduct(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isTextPresent(String product) {
        return waitForElementToBeDisplayed(products(product), driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public WebElement products(String productName) {
        return driver.findElement(By.xpath("//p[contains(text(),'" + productName + "')]"));
    }
}
