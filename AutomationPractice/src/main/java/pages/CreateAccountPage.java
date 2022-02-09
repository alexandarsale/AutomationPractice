package pages;

import Utils.ReadPropertyFile;
import components.AdressComponent;
import components.PersonalInformationComponent;
import components.Randomizer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waiter.Waiter.PAGE_LOAD_TIMEOUT;
import static waiter.Waiter.waitForElementToBeDisplayed;

public class CreateAccountPage extends BasePage {

    private final PersonalInformationComponent personalInformationComponent;
    private final Randomizer randomizer;
    private final AdressComponent adressComponent;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    private WebElement personalInfoText;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        personalInformationComponent = new PersonalInformationComponent(driver);
        randomizer = new Randomizer();
        adressComponent = new AdressComponent(driver);
    }

    @Override
    public boolean isOpened() {
        return waitForElementToBeDisplayed(personalInfoText, driver, PAGE_LOAD_TIMEOUT);
    }

    /* Adding Personal Information */

    public void selectGender() {
        personalInformationComponent.selectGender();
    }

    public void enterFirstName() {
        personalInformationComponent.setFirsName(randomizer.firstNameRandomizer());
    }

    public void enterLastName() {
        personalInformationComponent.setLastName(randomizer.lastNameRandomizer());
    }

    public void enterPassword() {
        personalInformationComponent.setPassword(ReadPropertyFile.getValue("password"));
    }

    public void enterBirthDate() {
        personalInformationComponent.setDay(ReadPropertyFile.getValue("day"));
        personalInformationComponent.setMonth(ReadPropertyFile.getValue("month"));
        personalInformationComponent.setYear(ReadPropertyFile.getValue("year"));
    }

    public void clickNewsletter() {
        personalInformationComponent.clickNewsletterBox();
    }

    public void clickOffers() {
        personalInformationComponent.clickSpecialOfferBox();
    }

    /* Adding Address and Company Information*/

    public void setCompanyName() {
        adressComponent.enterCompany(ReadPropertyFile.getValue("company"));
    }

    public void setAddress() {
        adressComponent.enterAddress(ReadPropertyFile.getValue("address"));
    }

    public void setCity() {
        adressComponent.enterCity(ReadPropertyFile.getValue("city"));
    }

    public void selectState() {
        adressComponent.selectState(ReadPropertyFile.getValue("state"));
    }

    public void setZipCode() {
        adressComponent.enterPostalCode(ReadPropertyFile.getValue("zipcode"));
    }

    public void enterPhoneNumber() {
        adressComponent.enterPhoneNumber(ReadPropertyFile.getValue("number"));
    }

    public void clickRegisterButton() {
        adressComponent.clickRegisterButton();
    }
}
