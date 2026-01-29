package Week13Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirFoxBrowserAssignment {
    public static void main(String[] args) {

//Purpose of the Assessment:
//By completing this assessment, students will:
//
//a.Understand basic browser interactions: Gain practical experience in opening a web browser, navigating to a URL, and retrieving important page information such as the current URL and page title.
//
//b.Work with browser window management: Learn how to programmatically control the browser window, such as maximizing it.
//
//c.Build foundational Selenium knowledge: Develop a strong foundation in creating simple Selenium scripts, which is essential for more advanced web automation tasks.

        //declare instance
        WebDriver driver = new FirefoxDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/Xpath.php
        driver.get("https://www.syntaxprojects.com/");

        //get the current url and print it on the screen
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //Get title
        String title = driver.getTitle();
        System.out.println(title);

        //Close the browser
        driver.quit();

    }

}
