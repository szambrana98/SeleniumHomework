package Week15Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {

        //Declare Instance
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //go to Syntax.com
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");


        //Print all entries with the country USA
        List<WebElement> countries =driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count = 1;
        for (WebElement country:countries){
            String countryValue = country.getText();
            if (countryValue.equals("USA")){
                //print particular row
                System.out.println(count);
                // get all rows with this value
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }
            count++;
        }


    }
}
