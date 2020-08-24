package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {

    WebDriver driver;
    private static final String ASOS_URL = "https://asos.com/";


//    @BeforeTest
//    public void profileSetUp() {
//        System.setProperty("webdriver.chrome.driver", "usr/bin/chromedriver");
//    }
// Uncomment it if chromedriver is not set in system path

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASOS_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public WomenPage getWomenPage() {
        return new WomenPage(getDriver());
    }

    public MenPage getMenPage() {
        return new MenPage(getDriver());
    }

    public BagPage getBagPage() {
        return new BagPage(getDriver());
    }
}
