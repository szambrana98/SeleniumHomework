package Week13Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/advanceXpath.php
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        //find user ID using CSS
        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("1234");

        //profile textbox
        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Sergio Z");

        //Intro to Lecture
        WebElement introToLecture = driver.findElement(By.cssSelector("input[name*='LectureIntro']"));
        introToLecture.sendKeys("Good morning");

        //Feedback from Ray
        WebElement feedBack1 = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedBack1.sendKeys("Feedback 1");

        //Feedback from Ducky
        WebElement feedBack2 = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBack2.sendKeys("Feedback 2");

        //Client Id
        WebElement clientId = driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clientId.sendKeys("789");

        //Email
        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("szambrana98@gmail.com");

        //Course Topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        courseTopic.sendKeys("Java");

    }
}
