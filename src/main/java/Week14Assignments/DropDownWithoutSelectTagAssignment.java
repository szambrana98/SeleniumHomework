package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTagAssignment {
    public static void main(String[] args) {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //Choose your dream Fruit
        WebElement dropDown = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        dropDown.click();

        //retreive all options for dropdown 1
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement option: options) {
            String optionText= option.getText();
            if (optionText.equals("Mango")){
                option.click();
            }
        }

        //choose your favorite hobby
        WebElement dropDown2 = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        dropDown2.click();

        //retreive all options for dropdown 2
        List<WebElement> options2 = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement option2: options2) {
            String optionText= option2.getText();
            if (optionText.equals("Reading")){
                option2.click();
            }
        }



    }
}
