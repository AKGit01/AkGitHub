package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Brokenlink {

	WebDriver driver;
	String url ="https://www.flipkart.com/";
	
	@Test
	public void open() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement E1 = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		E1.sendKeys("mobile"+ Keys.ENTER);
	}
	@Test(dependsOnMethods = "open")
	public void getlink() {
		
		List<WebElement> httpl = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + httpl.size());
		for(WebElement ht:httpl) {
			System.out.println("List of http = " + ht.getAttribute("href"));
		}
	}
	@Test(dependsOnMethods = "getlink")
	public void checklink() {
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + link.size());
		for(WebElement l1 :link) {
			System.out.println(RestAssured.given().when().get(l1.getAttribute("href")).statusCode());
		}
	}
	
	@AfterClass
	public void closedriver() {
		driver.close();
		driver.quit();
	}
}
