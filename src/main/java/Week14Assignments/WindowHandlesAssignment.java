package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.ForkJoinPool;

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
        System.out.println("Main window handle: "+mainWindowHandle);


        //click b1
        WebElement b1 = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        b1.click();
        //get all window Handles
        Set<String> allWindowsb1 = driver.getWindowHandles();
        //switch to new window
        for (String win:allWindowsb1){
            if (!win.equals(mainWindowHandle)){
                driver.switchTo().window(win);
                break;
            }
        }
        //verify text in B1 Window
        WebElement b1Text = driver.findElement(By.tagName("h2"));
        String b1TextVerify = b1Text.getText();
        System.out.println("B1 Window text: "+b1TextVerify);
        //verify -- instruction say it must say "Welcome to B1 page
        if (b1TextVerify.equals("Welcome to B1 page")){
            System.out.println("B1 text matched");
        }else {
            System.out.println("B1 text did not match");
        }


        //close window and switch to main
        driver.close();
        driver.switchTo().window(mainWindowHandle);


        //click b2
        WebElement b2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        b2.click();
        //get all window handles
        Set<String> allWindowsB2 = driver.getWindowHandles();
        //switch to new window
        for (String win:allWindowsB2){
            if (!win.equals(mainWindowHandle)){
                driver.switchTo().window(win);
                break;
            }
        }
        //verify text in B2 window
        WebElement b2Text = driver.findElement(By.tagName("h2"));
        String b2TextVerify = b2Text.getText();
        System.out.println("B2 Window text: "+b2TextVerify);
        //verify -- instruction say it must say "Welcome to B2 page
        if (b2TextVerify.equals("Welcome to B2 page")){
            System.out.println("B2 text matched");
        }else {
            System.out.println("B2 text did not match");
        }


        //close window and switch back to main
        driver.close();
        driver.switchTo().window(mainWindowHandle);
        //close window
        driver.quit();
            }
        }




        