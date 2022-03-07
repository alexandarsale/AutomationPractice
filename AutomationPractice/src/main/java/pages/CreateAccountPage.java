package pages;

import Utils.ReadPropertyFile;
import components.AdressComponent;
import components.PersonalInformationComponent;
import components.Randomizer;
import model.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static model.Address.*;
import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class CreateAccountPage extends BasePage {

    private final PersonalInformationComponent personalInformationComponent;
    private final Randomizer randomizer;
    private final AdressComponent adressComponent;
    private final Map<Address, String> address;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    private WebElement personalInfoText;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        personalInformationComponent = new PersonalInformationComponent(driver);
        randomizer = new Randomizer();
        adressComponent = new AdressComponent(driver);
        address = getAddress();
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(personalInfoText, driver, PAGE_LOAD_TIMEOUT);
    }

    @Override
    public boolean isTextPresent(String text) {
        return false;
    }

    /* Adding Personal Information */
    public void setPersonalData() {
        selectGender();
        enterFirstName();
        enterLastName();
        enterPassword();
        enterBirthDate();
        clickNewsletter();
        clickOffers();
    }

    /* Adding address information */
    public void setAddressData() {
        adressComponent.enterCompany(address.get(Company));
        adressComponent.enterAddress(address.get(Street));
        adressComponent.enterCity(address.get(City));
        adressComponent.selectState(address.get(State));
        adressComponent.enterPostalCode(address.get(ZipCode));
        adressComponent.enterPhoneNumber(address.get(PhoneNumber));
        clickRegisterButton();
    }

    private void selectGender() {
        personalInformationComponent.selectGender();
    }

    private void enterFirstName() {
        personalInformationComponent.setFirsName(randomizer.firstNameRandomizer());
    }

    private void enterLastName() {
        personalInformationComponent.setLastName(randomizer.lastNameRandomizer());
    }

    private void enterPassword() {
        personalInformationComponent.setPassword(ReadPropertyFile.getValue("password"));
    }

    private void enterBirthDate() {
        personalInformationComponent.setDay(ReadPropertyFile.getValue("day"));
        personalInformationComponent.setMonth(ReadPropertyFile.getValue("month"));
        personalInformationComponent.setYear(ReadPropertyFile.getValue("year"));
    }

    private void clickNewsletter() {
        personalInformationComponent.clickNewsletterBox();
    }

    private void clickOffers() {
        personalInformationComponent.clickSpecialOfferBox();
    }

    private void clickRegisterButton() {
        adressComponent.clickRegisterButton();
    }
}
