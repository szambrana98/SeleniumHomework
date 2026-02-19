package Week15Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        //Declare Instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to Syntax.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");


        //Change Text
        WebElement changeText = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeText.click();
        //Need to wait for text to change
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        //read text
        WebElement readText = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(readText.getText());


        //enable button
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();
        //wait
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-default'])[3]")));
        //display button - enabled
        WebElement enabled = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]"));
        enabled.click();


        //checkbox checked based on click
        WebElement cb = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        cb.click();
        //wait
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='checkbox']")));
        //click cb
        WebElement checkCB = driver.findElement(By.xpath("//input[@id='checkbox']"));
        checkCB.click();



    }
}
