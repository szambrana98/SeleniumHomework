package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to Syntax.com
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");


        //Select Age Checkbox
        //switch to correct frame
        driver.switchTo().frame("dropdownIframe");
        //siwthc to inner frame
        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(nestedIframe);
        //clickcheckbox
        WebElement age = driver.findElement(By.xpath("//input[@type='checkbox']"));
        age.click();


        //Select City
        //switch back to main frame
        driver.switchTo().defaultContent();
        //switch to dropdown frame
        driver.switchTo().frame("dropdownIframe");
        //click drop down and select city
        WebElement city = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel = new Select(city);
        sel.selectByValue("Chicago");


        //Enter Username
        //go to main page
        driver.switchTo().defaultContent();
        //switch to inner frame -- ctrl f -- iframe
        driver.switchTo().frame("textfieldIframe");
        WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("Szam");




    }
}
