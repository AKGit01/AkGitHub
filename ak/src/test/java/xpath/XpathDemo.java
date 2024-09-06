package xpath;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {
    
    @Test
    public void xpathFind() {
        // Set up ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        
        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();
        
        // Navigate to a webpage
        driver.get("https://demo.opencart.com/");
        System.out.println("Title: " + driver.getTitle());
        
        // Add your XPath logic here (e.g., finding elements)
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("shirt");
        
        
        // Close the browser after the test
       // driver.quit();
    }
}

