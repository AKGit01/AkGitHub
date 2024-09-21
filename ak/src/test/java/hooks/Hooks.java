package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    private WebDriver driver;
    private final String url = "https://www.amazon.in/ref=nav_logo";
    
//Hooks apply to all feature files and scenarios unless scoped specifically.
    @Before
    public void setup() {
        // Setup ChromeDriver using WebDriverManager
        //WebDriverManager.chromedriver().setup();  // Automatically handles ChromeDriver binary

        // Initialize WebDriver and configure browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @After
    public void teardown() {
        // Ensure the driver is properly closed and quit
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver; // Getter method for sharing WebDriver across step definitions
    }
}
