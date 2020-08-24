package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BagPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Miss Selfridge smock dress')]")
    public WebElement nameOfAddedDress;

    @FindBy(xpath = "//button[@class='bag-item-remove']")
    public WebElement removeItemButton;

    @FindBy(xpath = "//h2[@class='empty-bag-title']")
    public WebElement emptyBagMessage;

    public BagPage(WebDriver driver) {
        super(driver);
    }

    public String nameOfAddedDress() {
        waitUntilElementIsVisible(10, nameOfAddedDress);
        return nameOfAddedDress.getText();
    }

    public void removeItemFromBag(long timeToWait) {
        waitUntilElementIsClickable(timeToWait, removeItemButton);
        removeItemButton.click();
    }


    public String emptyBagMessage(long timeToWait) {
        waitUntilElementIsClickable(timeToWait, emptyBagMessage);
        return emptyBagMessage.getText();
    }

}
