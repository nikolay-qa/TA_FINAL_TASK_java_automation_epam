package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MenPageTests extends BaseTest {

    private final String EXPECTED_SHOP_THE_BRAND_PAGE = "https://www.asos.com/men/a-to-z-of-brands/asos-dark-future/cat";

    @Test(priority = 9)
    public void CheckShopCollectionButton() {
        getHomePage().clickOnMenButton();
        getBasePage().waitForPageLoadComplete(30);
        getMenPage().clickOnShopTheBrandButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SHOP_THE_BRAND_PAGE));
    }
}
