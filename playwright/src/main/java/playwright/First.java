package playwright;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class First {

  //  public static void main(String[] args) {
	
	//Use of codegen
	//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen google.com"
	//npx playwright codegen --browser=firefox https://example.com
	//npx playwright codegen --headless https://example.com
	
	@Test
	public void start() {
        // Initialize Playwright
        Playwright playwright = Playwright.create();
        
        // Launch Chromium browser in headed mode
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        // Create a new page
        Page page = browser.newPage();
        
        // Navigate to Playwright's official page
        page.navigate("https://playwright.dev/java/");
        
        // Get and print the page title
        String title = page.title();
        System.out.println("Title is = " + title);
        
        assertThat(page).hasTitle(Pattern.compile("Playwright"));
        
        // Check if the "Get started" link is visible
        boolean isVisible = page.locator("text='Get started'").isVisible();
        System.out.println("Object present: " + isVisible);

        // Click the "Get started" link
        if (isVisible) {
            page.locator("text='Get started'").click();
        } else {
            System.out.println("The 'Get started' button is not visible.");
        }
        
        // Close the browser
        browser.close();
        
        // Close Playwright
        playwright.close();
    }
}
