package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxesAssignment {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //Newsletter enabled?
        WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        Boolean newsLetterEnabled = newsletter.isEnabled();
        System.out.println("Newsletter checkbox enabled? " + newsLetterEnabled);
        newsletter.click();

        //Select Hobbies
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement checkbox : checkBoxes) {
            if (checkbox.getAttribute("value").equals("reading")) {
                checkbox.click();
            }
        }
        List<WebElement> checkBoxes2 = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement checkbox : checkBoxes2) {
            if (checkbox.getAttribute("value").equals("cooking")) {
                checkbox.click();

            }
        }

        //verify music and support not displayed
        WebElement music = driver.findElement(By.xpath("//input[@value='Music']"));
        Boolean musicDisplayed = music.isDisplayed();
        System.out.println("Music box is displayed? " + musicDisplayed);

        WebElement support = driver.findElement(By.xpath("//input[@value='Support']"));
        Boolean supportDisplayed = music.isDisplayed();
        System.out.println("Support box is displayed? " + supportDisplayed);

        //Show interests section - select music
        WebElement showMore = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showMore.click();

        //select music
        WebElement selectMusic = driver.findElement(By.xpath("//input[@value='Music']"));
        selectMusic.click();

        //verify receive notifications is disabled
        WebElement recoeveNotifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        Boolean recieveDisabled = recoeveNotifications.isEnabled();
        System.out.println("Receive notifications is enabled? "+recieveDisabled);

        //enable checkboxes
        WebElement enableCB = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCB.click();

        //select receive notifications
        recoeveNotifications.click();

    }
}