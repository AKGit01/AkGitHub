package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    // Define locators for elements on the home page
    By searchBox = By.name("q"); // Example: Google search box
    By searchButton = By.name("btnK"); // Example: Google search button

    // Constructor to initialize the WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter text in the search box
    public void enterSearchText(String searchText) {
        WebElement searchElement = driver.findElement(searchBox);
        searchElement.clear();
        searchElement.sendKeys(searchText);
    }

    // Method to click the search button
    public void clickSearchButton() {
        WebElement searchBtn = driver.findElement(searchButton);
        searchBtn.submit();
    }

    // Method to get the page title
    public String getPageTitle() {
        return driver.getTitle();
    }
}
