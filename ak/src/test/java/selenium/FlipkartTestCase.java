package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FlipkartTestCase {

	String Url = "https://www.flipkart.com/";
	WebDriver driver;

	@Test
	public void openweb() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement E1 = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		E1.sendKeys("Mobile");
		E1.sendKeys(Keys.ENTER);

		List<WebElement> L1 = driver.findElements(
				By.xpath("//div[contains(@class,'col')]//div[@class='KzDlHZ']"));
		String parentWindowId = driver.getWindowHandle();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		for (WebElement w : L1) {
			String text = w.getText();
			System.out.println(text);
			if (text.contains("vivo")) {
				System.out.println("Match found in for loop: vivo");
				try {
                    // Wait until the element is clickable before clicking
                    wait.until(ExpectedConditions.elementToBeClickable(w));
                    w.click();
                } catch (Exception e) {
                    System.out.println("Element not clickable or timed out: " + e.getMessage());
                }
                break;
			}
		}
		Iterator<WebElement> I = L1.iterator();
		while (I.hasNext()) {
			WebElement element = I.next();
			System.out.println(element.getText());

			// Check if the product text contains "vivo"
			if (element.getText().contains("vivo")) {
				System.out.println("Match found in while : vivo");
				element.click();
				break;
			}
		}

		Set<String> windowsList = driver.getWindowHandles();
		// Iterate through each window handle
		for (String eachBrowserWindow : windowsList) {
			// Check if the current window is not the parent window
			if (!eachBrowserWindow.equals(parentWindowId)) {
				try {
					// Try switching to the new window
					driver.switchTo().window(eachBrowserWindow);
					Thread.sleep(2000); // Pause for 2 seconds to ensure the window is loaded
					// Perform action inside the new window (e.g., clicking the cart button)
					driver.findElement(By.xpath("//a[contains(@href, 'cart')]//span")).click();
				} catch (NoSuchWindowException e) {
					// Handle the exception when the window is not found
					System.out.println("The window could not be found or is no longer available: " + e.getMessage());
				} catch (InterruptedException e) {
					// Handle interrupted exceptions for the Thread.sleep
					System.out.println("Thread sleep was interrupted: " + e.getMessage());
				}
			}
		}
	}

	@AfterClass
	public void closedriver() {
		driver.close();
		driver.quit();
	}

}
