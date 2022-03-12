package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ProductListComponent extends BasePage {

    @FindBy(xpath = "//div[@class='right-block-content row']/div[1]/span[1]")
    private List<WebElement> productPrice;

    @FindBy(css = "a[title='Add to cart']")
    private List<WebElement> addToCartBtnList;

    @FindBy(css = "span.ajax_block_products_total")
    private WebElement confirm;

    public ProductListComponent(WebDriver driver) {
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

    public void getProductPrice() {
        for (int i = 0; i < productPrice.size(); i++) {
            String price = productPrice.get(i).getText();
            price = price.replaceAll("\\$", "");
            double pPrice = Double.parseDouble(price);
            if (pPrice < 30 && pPrice > 27) {
                click(addToCartBtnList.get(i));
            }
        }
    }
}
