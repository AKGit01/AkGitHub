package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNgannotation {
    
    WebDriver driver;
    
    @BeforeSuite
    public void setUpSuite() {
        // Global setup, e.g., setting system properties for WebDriver
        System.out.println("Before Suite");
    }
    
    @BeforeClass
    public void setUp() {
        // Setup WebDriver and open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @BeforeMethod
    public void navigateToHomePage() {
        // Navigate to home page before each test
        driver.get("https://example.com");
    }
    
    @Test(priority = 1)
    public void testHomePageTitle() {
        // Check the title of the homepage
        String title = driver.getTitle();
        System.out.println("Home Page Title: " + title);
    }
    
    @Test(priority = 2, dependsOnMethods = "testHomePageTitle")
    public void testSearchFunction() {
        // Test the search functionality
        // WebElement searchBox = driver.findElement(By.name("q"));
        // searchBox.sendKeys("Selenium" + Keys.ENTER);
        System.out.println("Testing Search Functionality");
    }
    
    @AfterMethod
    public void afterTest() {
        // Code to execute after each test method
    }
    
    @AfterClass
    public void tearDown() {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
    
    @AfterSuite
    public void afterSuite() {
        // Clean up after suite
        System.out.println("After Suite");
    }
}
