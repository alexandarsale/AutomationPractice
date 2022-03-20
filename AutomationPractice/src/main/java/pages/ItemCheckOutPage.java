package pages;

import components.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class ItemCheckOutPage extends BasePage{

    private final ProductSuccessfullyAddedToCartComponent prAdded;
    private final AddressCheckoutComponent checkout;
    private final PaymentComponent payment;
    private final ShippingComponent shippingComponent;
    private final SummaryComponent summaryComponent;
    private final OrderStepsComponent orderStepsComponent;

    @FindBy(css = "div.layer_cart_product")
    private WebElement itemAddedToCartText;

    public ItemCheckOutPage(WebDriver driver) {
        super(driver);
        prAdded = new ProductSuccessfullyAddedToCartComponent(driver);
        checkout = new AddressCheckoutComponent(driver);
        payment = new PaymentComponent(driver);
        shippingComponent = new ShippingComponent(driver);
        summaryComponent = new SummaryComponent(driver);
        orderStepsComponent = new OrderStepsComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(itemAddedToCartText, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    public void clickProceedCheckOutButton(){
        prAdded.clickProceedCheckOut();
    }

    public void clickContinueShoppingBtn(){
        prAdded.getContinueShoppingBtn();
    }

    public void clickProceedBtn(){
        summaryComponent.proceedBtn();
    }

    public void addQuantityBtn(){
        summaryComponent.enterQuantity("2");
    }

    public void clickSummaryStep(){
        orderStepsComponent.getSummaryStep();
    }

    public void substractQuantityBtn(){
        summaryComponent.subtractQuantity();
    }

    public void checkTermsAndConditions(){
        shippingComponent.termsAndConditions();
    }

    public void selectPaymentViaBank(){
        payment.bankPayment();
    }

    public void selectPaymentViaCheck(){
        payment.checkPayment();
    }

    public void clickConfirmOrderBtn(){
        payment.confirmOrder();
    }

    public void clickProcessBtn(){
        checkout.processBtn();
    }

    public void clickCarrierBtn(){
       shippingComponent.carrierBtn();
    }
}
