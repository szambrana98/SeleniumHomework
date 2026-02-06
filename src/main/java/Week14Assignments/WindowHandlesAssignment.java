package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesAssignment {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to https://syntaxprojects.com/Xpath.php
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");


        //store main window handle
        String mainWindowHandle = driver.getWindowHandle();
        //Ensure that the clicking of button 1 opens a new window
        //Click on button 1 and button 2
        WebElement b1 = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        WebElement b2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        b1.click();
        b2.click();

        //Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"


        //Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"


            }
        }












    }
}
