package Week13Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocatorsIncorrectEmailScenario {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximize screen
        driver.manage().window().maximize();

        //navigate to syntax projects
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        //send the firstname to the text box
        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("Sergio Zambrana");

        //send the email to the text box
        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("szambrana98hotmail.com");


        //Client name
        WebElement clientName = driver.findElement(By.name("ClientName"));
        clientName.sendKeys("John Doe");

        //Client ID
        WebElement clientID = driver.findElement(By.name("ClientId"));
        clientID.sendKeys("123456789");

        //Client Feedback
        WebElement clientFeedback = driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Client Feedback Input");

        //Project NAme
        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Project Name Input Here");

        //Project Deadline Time
        WebElement projectDeadline = driver.findElement(By.id("ProjectTimeId"));
        projectDeadline.sendKeys("11:59pm");

        //Current Address
        WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("1234 Syntax Rd, Fairfax VA 22042");

        //Permananet Address
        WebElement permanentAddress = driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("1234 Syntax Rd, Fairfax VA 22042");

        //check if email has @
        String emailValue = email.getAttribute("value");
        if (!emailValue.contains("@")) {
            System.out.println("invalid email, missing @");
        } else {

            //Submit
            WebElement submit = driver.findElement(By.name("btn-submit"));
            submit.click();
        }
        //Click Here
        WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        clickHere.click();


    }
}
