package Week15Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigationAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();

        // Select the "From" date [make sure to put date in future
        selectDate(driver, By.xpath("//input[@id='from_date']"), "April", "4");

        // Select the "To" date
        selectDate(driver, By.xpath("//input[@id='to_date']"), "May", "10");

        // Close the driver
       driver.quit();
    }


    public static void selectDate(WebDriver driver, By calendarLocator, String month, String date) {
        // Open the calendar
        driver.findElement(calendarLocator).click();

        boolean isFound = false;

        while (!isFound) {
            // Get the currently displayed month
            WebElement currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            if (currentMonth.getText().equals(month)) {
                // Get all date elements in the calendar
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for (WebElement day : allDates) {
                    if (day.getText().equals(date)) {
                        day.click();
                        isFound = true;
                        break;
                    }
                }
            } else {
                // Click the "Next" button to go to the next month
                driver.findElement(By.xpath("//span[text()='Next']")).click();
            }
        }
    }
}