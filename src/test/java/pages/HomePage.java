package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='chrome-search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@data-testid='accountIcon']")
    private WebElement accountButton;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@data-testid='women-floor']")
    private WebElement womenButton;

    @FindBy(xpath = "//a[@data-testid='men-floor']")
    private WebElement menButton;

    @FindBy(xpath = "//div[@id='miniBagDropdown']")
    private WebElement miniBagDropdown;

    @FindBy(xpath = "//a[@data-test-id='bag-link']")
    private WebElement viewBagButton;

    @FindBy(xpath = "//a[@data-testid='help']")
    private WebElement helpButton;

    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    private WebElement favoriteList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnAccountButton() {
        accountButton.click();
    }

    public void clickOnWomenButton() {
        womenButton.click();
    }

    public void clickOnMenButton() {
        menButton.click();
    }

    public void clickOnHelpButton() {
        helpButton.click();
    }

    public void clickOnFavoriteList() {
        favoriteList.click();
    }


    public void clickOnSignInButton() {
        waitUntilElementIsClickable(10, signInButton);
        signInButton.click();
    }

    public void hoverOverMiniBagDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(miniBagDropdown);
    }

    public void clickOnViewBagButton() {
        waitUntilElementIsClickable(10, viewBagButton);
        viewBagButton.click();
    }
}
