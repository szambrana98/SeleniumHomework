package Week13Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandsAssignment {
    public static void main(String[] args) {

        //Acceptance Criteria:
        //1. The user successfully opens Chrome and maximizes the window using `window().maximize()`.
        //2. The user navigates to `www.google.com`, and the page title is printed correctly.
        //3. The user navigates to `https://www.syntaxprojects.com/`, and the page title is printed correctly.
        //4. The user successfully navigates back to `www.google.com` using `navigate().back()`.
        //5. The page at `www.google.com` is refreshed using `navigate().refresh()`.
        //6. The browser closes after completing all the navigation steps.

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https://www.google.com");

        //Get first title
        String title = driver.getTitle();
        System.out.println("The title of the first page is: " + title);

        //navigate to other website
        driver.navigate().to("https://www.syntaxprojects.com/");

        //Get second title
        String title2 = driver.getTitle();
        System.out.println("The title of the second page is: " + title2);

        //go back to google
        driver.navigate().back();

        //refresh
        driver.navigate().refresh();

        //Close the browser
        driver.quit();

    }
}
