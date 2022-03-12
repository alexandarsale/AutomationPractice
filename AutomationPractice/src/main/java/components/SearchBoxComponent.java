package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SearchBoxComponent extends BasePage {

   @FindBy(css = "#search_query_top")
   private WebElement searchBox;

   @FindBy(css = "button[name='submit_search']")
   private WebElement searchBtn;


    public SearchBoxComponent(WebDriver driver) {
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

    public void getSearchBox(String search){
        sendKeys(searchBox, search);
    }

    public void getSearchBtn(){
        click(searchBtn);
    }

}