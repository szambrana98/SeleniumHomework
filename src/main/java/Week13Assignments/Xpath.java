package Week13Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/advanceXpath.php
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        //find the username
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Soccer");

        //click here
        WebElement clickHere = driver.findElement(By.xpath("//button[@id='display_text']"));
        clickHere.click();

        //Favorite Movies
        WebElement movies = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movies.sendKeys("Interstellar");

        //Paragraph
        WebElement paragraph = driver.findElement(By.xpath("//label[contains(text(),'dolorum')]"));
        String text = paragraph.getText();
        System.out.println(text);

        //city
        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Falls Church");

        //Select using indexing - field 1
        WebElement emails1 = driver.findElement(By.xpath("(//input[@type='email' and @class ='form-control' ])[1]"));
        emails1.sendKeys("Personal Email");

        //Select using indexing - field 2
        WebElement emails2 = driver.findElement(By.xpath("(//input[@type='email' and @class ='form-control' ])[2]"));
        emails2.sendKeys("Office Email");

        //Select using indexing - field 3
        WebElement emails3 = driver.findElement(By.xpath("(//input[@type='email' and @class ='form-control' ])[3]"));
        emails3.sendKeys("Professional Email");

        //Select using multiplw Attributes - Field 1
        WebElement multipleElements1 = driver.findElement(By.xpath("//input[@ data-detail='one' and @id='clientName']"));
        multipleElements1.sendKeys("Sergio");

        //Select using multiplw Attributes - Field 2
        WebElement multipleElements2 = driver.findElement(By.xpath("//input[@ data-detail='two' and @name='clientId']"));
        multipleElements2.sendKeys("1234");

        //Select your choice of Xpath
        WebElement yourChoice1 = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        yourChoice1.sendKeys("789");

        WebElement yourChoice2 = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        yourChoice2.sendKeys("456");



    }
}
