package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private final String SEARCH_KEYWORD = "Miss Selfridge smock dress with v neck in black ditsy";
    private final String EXPECTED_SEARCH_QUERY = "&SearchQuery=miss+selfridge+smock+dress+with+v+neck+in+black+ditsy";

    @Test(priority = )
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }


}
