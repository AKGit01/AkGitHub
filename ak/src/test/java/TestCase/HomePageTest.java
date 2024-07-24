package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Library.CommonFunction;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

public class HomePageTest {
    WebDriver driver;
    HomePage homePage;
    CommonFunction waitpage;

    @BeforeClass
    public void setUp() {
        // Set the path to chromedriver.exe
       System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium_Jars/chromedriver.exe");
        
        // Initialize the Chrome driver
        driver = new ChromeDriver();
        
        // Navigate to the home page
        driver.get("http://www.google.com");

        // Initialize the HomePage object
        homePage = new HomePage(driver);
        
        // Initialize the Commonfunction object
        //waitpage = new CommonFunction(driver);
    }

    @Test
    public void testSearch() {
        // Enter search text and click the search button
       // homePage.enterSearchText("Selenium WebDriver");
        //homePage.clickSearchButton();
        // Verify that the page title contains "Selenium WebDriver"
       // String pageTitle = homePage.getPageTitle();
     // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      
        // Wait until the element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb"))).sendKeys("Selenium WebDriver");
        homePage.clickSearchButton();
        assertTrue(driver.getTitle().contains("Selenium"), "Page title does not contain 'Selenium WebDriver'");
        // Find and click on the first search result link
        WebElement firstResultLink = driver.findElement(By.cssSelector("h3"));
        firstResultLink.click();

        // Wait for the next page to load completely
        CommonFunction.waitForPageLoad(driver);
        
        assertTrue(driver.getTitle().contains("WebDriver"), "Page title does not contain 'WebDriver'");
        
    }

    @AfterClass
    public void tearDown() {
        // Close the browser 
        if (driver != null) {
            driver.quit();
        }
    }
}
