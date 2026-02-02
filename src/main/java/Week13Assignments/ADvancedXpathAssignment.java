package Week13Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADvancedXpathAssignment {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/advanceXpath.php
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");


        //preceding Sibling - 01
        WebElement precedingSiblingInput3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        precedingSiblingInput3.sendKeys("Our Universe2");

        WebElement precedingSiblingInput2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        precedingSiblingInput2.sendKeys("Black Holes");

        WebElement precedingSiblingInput1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        precedingSiblingInput1.sendKeys("Marvel Universe");

        //following sibling - 02
        WebElement followingSiblingInput1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        followingSiblingInput1.sendKeys("Hary Potter");

        WebElement followingSiblingInput2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        followingSiblingInput2.sendKeys("Captain Underpants");

        WebElement followingSiblingInput3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        followingSiblingInput3.sendKeys("Our Universe");

        //parent child relationship - 03
        WebElement childParent1 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        childParent1.sendKeys("Great Gatsby");

        WebElement childParent2 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        childParent2.sendKeys("Neutron Stars");

        WebElement childParent3 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        childParent3.sendKeys("The event horizon");

    }
}
