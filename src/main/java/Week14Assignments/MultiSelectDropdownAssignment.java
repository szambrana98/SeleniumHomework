package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdownAssignment {
    public static void main(String[] args) throws InterruptedException {

        //declare instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to google.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //select pear
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        Select sel = new Select(dropDown);
        sel.selectByIndex(3);

        //display all options for dropdown 1
        List<WebElement> allOptions = sel.getOptions();
        for (WebElement option:allOptions) {
            System.out.println(option.getText());
        }


        //dropdown 2
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel2 = new Select(dropDown2);
        Boolean multiSelect = sel2.isMultiple();
        System.out.println("The second drop down is multiselect: "+multiSelect);

        //select multiple
        sel2.selectByIndex(1);
        sel2.selectByVisibleText("Cooking");
        sel2.selectByValue("Gardening");

        //click get all button
        WebElement getAll = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAll.click();

        //print the ones selected
        List<WebElement> allOptions2 = sel2.getAllSelectedOptions();
        for (WebElement option2:allOptions2) {
            System.out.println(option2.getText());
        }

        //delay 5 seconds
        Thread.sleep(5000);

        //deselect travelling option
        sel2.deselectByIndex(1);

        //delay to view "get all selected" button press again
        Thread.sleep(2000);

        //click get all selected again
        getAll.click();





    }
}
