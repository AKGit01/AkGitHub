package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FlipkartTestCase {

	String Url = "https://www.flipkart.com/";
	WebDriver driver;

	@Test
	public void openweb() {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement E1=driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		E1.sendKeys("Mobile");
		E1.sendKeys(Keys.ENTER);

		List<WebElement>L1=driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']//div[@class='yKfJKb row']//div[@class='KzDlHZ']"));
		String parentWindowId = driver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		for(WebElement w : L1) {
			String text = w.getText();
			System.out.println(text);
		}
		Iterator<WebElement> I = L1.iterator();
		while (I.hasNext()) {
			WebElement element = I.next();
			System.out.println(element.getText());

			// Check if the product text contains "vivo"
			if (element.getText().contains("vivo")) {
				System.out.println("Match found: vivo");
				element.click();
				break;
			}
		}

		Set<String> windowsList = driver.getWindowHandles();
		for(String eachBrowserWindow: windowsList) {
			if(!eachBrowserWindow.equals(parentWindowId))			
			{
				driver.switchTo().window(eachBrowserWindow);
				driver.findElement(By.xpath("//a[contains(@href , 'cart')]//span")).click();	
			}	

		}
	}
	@AfterClass
	public void closedriver() {
		driver.close();
		driver.quit();
	}

}
