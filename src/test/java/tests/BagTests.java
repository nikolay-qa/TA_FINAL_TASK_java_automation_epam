package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BagTests extends BaseTest {

    private final String SEARCH_KEYWORD = "Miss Selfridge smock dress with v neck in black ditsy";
    private final String EXPECTED_EMPTY_BAG_MESSAGE = "Your bag is empty";
    private final String EXPECTED_SIGN_IN_PAGE = "https://my.asos.com/identity/login?signin";

    @Test(priority = 1)
    public void checkThatItemAddedToBagAfterClickingOnAddToBagButton() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultsPage().chooseSizeOfTheWantedItem();
        getSearchResultsPage().clickOnTheAddToBagButton();
        getHomePage().hoverOverMiniBagDropdown();
        getHomePage().clickOnViewBagButton();
        String actualName = getBagPage().nameOfAddedDress();
        assertEquals(actualName, SEARCH_KEYWORD);
    }

    @Test(priority = 2)
    public void checkThatItemIsDeletedFromBag() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultsPage().chooseSizeOfTheWantedItem();
        getSearchResultsPage().clickOnTheAddToBagButton();
        getHomePage().hoverOverMiniBagDropdown();
        getHomePage().clickOnViewBagButton();
        getBagPage().removeItemFromBag(10);
        String actualMessage = getBagPage().emptyBagMessage(10);
        assertEquals(actualMessage, EXPECTED_EMPTY_BAG_MESSAGE);
    }

    @Test(priority = 3)
    public void checkThatSignInPageIsShownAfterClickingOnCheckoutButtonWithUnauthorizedUser() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        getSearchResultsPage().chooseSizeOfTheWantedItem();
        getSearchResultsPage().clickOnTheAddToBagButton();
        getHomePage().hoverOverMiniBagDropdown();
        getSearchResultsPage().clickOnCheckoutButton();
        getBasePage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SIGN_IN_PAGE));
    }
}
