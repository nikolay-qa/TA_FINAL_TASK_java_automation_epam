package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage {

    @FindBy(xpath = "//span[@data-analytics-id='row-gbldarkfuture-shopthebrand']")
    private WebElement shopTheBrand;

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnShopTheBrandButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", shopTheBrand);
        shopTheBrand.click();
    }
}
