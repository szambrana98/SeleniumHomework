package Week15Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        //Declare Instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to Syntax.com
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");


        //global wait - implciit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Synchronization and waits
        WebElement b1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        b1.click();
        //get text
        WebElement b2 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        b2.click();
    }
}
