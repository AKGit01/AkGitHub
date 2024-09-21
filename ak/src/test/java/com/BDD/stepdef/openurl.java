package com.BDD.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
//import hooks.Hooks;

public class openurl {

    private WebDriver driver;
    private final String url = "https://www.amazon.in/ref=nav_logo";

    // Inject the Hooks class to get the WebDriver instance
   // public openurl(Hooks hooks) {
   //     this.driver = hooks.getDriver();
   // }
    
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on the login page");
        // Code to navigate to the login page, e.g., driver.get("http://example.com/login");
    }
    
  //@DataTableType
    @Given("Open the url")
    public void open_the_url() {
        driver = new ChromeDriver();
    	driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Opened Amazon website");
    }

    @When("^Enter (.*) in search$")
    public void enter_item_in_search(String value) {
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
        searchBox.sendKeys(value);
        System.out.println("Entered " + value + " in the search box");
    }

    @When("click on enter")
    public void click_on_enter() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Pressed Enter in the search box");
    }

    @Then("Mobile search results open")
    public void mobile_search_open() {
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[contains(@class,'base a-text-normal')]"));
        int count = 0;
        for (WebElement result : searchResults) {
            String text = result.getText();
            System.out.println("Mobile on list number: " + count + " with name: " + text);
            count++;
        }
        System.out.println("Total search results: " + count);
    }

    @Then("close browser")
    public void close_browser() {
        System.out.println("Closing browser");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
