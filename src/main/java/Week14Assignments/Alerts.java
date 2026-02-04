package Week14Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        //declare instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to Syntax.com
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");


        //click birthday reminder
        WebElement birthdayReminder = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayReminder.click();
        //accept alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();


        //Delete Confirmation
        WebElement deleteFile = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        //cancel alert2
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        //print status of 'press cancel' action
        WebElement cancel = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        String cancelText = cancel.getText();
        System.out.println(cancelText);


        //Enter your name
        WebElement nameCollection = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        nameCollection.click();
        //accept alert3
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Sergio");
        alert3.accept();
        //retrieve name
        WebElement retrieveName = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String fullText = retrieveName.getText();
        String onlyName = fullText.replace("You have entered","").trim();
        System.out.println(onlyName);




    }
}
