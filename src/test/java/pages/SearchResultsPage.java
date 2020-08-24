package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement sizeSelectDropdownList;

    @FindBy(xpath = "//option[text()='EU 40']")
    private WebElement EU40Size;

    @FindBy(xpath = "//a[@class='add-button']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//a[@data-test-id='checkout-link']")
    private WebElement checkoutButton;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseSizeOfTheWantedItem() {
        sizeSelectDropdownList.click();
        EU40Size.click();
    }

    public void clickOnTheAddToBagButton() {
        addToBagButton.click();
    }

    public void clickOnCheckoutButton() {
        waitUntilElementIsClickable(10, checkoutButton);
        checkoutButton.click();
    }
}
