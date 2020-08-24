package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {

    private final String EXPECTED_MEN_PAGE = "https://www.asos.com/men/";
    private final String EXPECTED_WOMEN_PAGE = "https://www.asos.com/women/";
    private final String EXPECTED_SIGN_IN_PAGE = "https://my.asos.com/identity/login?signin";
    private final String EXPECTED_HELP_PAGE = "https://www.asos.com/customer-care/";
    private final String EXPECTED_FAVORITE_PAGE = "https://www.asos.com/saved-lists/";

    @Test(priority = 4)
    public void CheckThatMenPageIsLoadingFromHomePage() {
        getHomePage().clickOnMenButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_MEN_PAGE));
    }

    @Test(priority = 5)
    public void CheckThatWomenPageIsLoadingFromHomePage() {
        getHomePage().clickOnWomenButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_WOMEN_PAGE));
    }

    @Test(priority = 6)
    public void CheckThatLoginPageIsLoadingFromHomePage() {
        getHomePage().clickOnAccountButton();
        getHomePage().clickOnSignInButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SIGN_IN_PAGE));
    }

    @Test(priority = 7)
    public void CheckThatHelpPageIsLoadingFromHomePage() {
        getHomePage().clickOnHelpButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_HELP_PAGE));
    }

    @Test(priority = 8)
    public void CheckThatFavoritePageIsLoadingFromHomePage() {
        getHomePage().clickOnFavoriteList();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_FAVORITE_PAGE));
    }
}
