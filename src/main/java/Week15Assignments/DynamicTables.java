package Week15Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://54.198.61.50/web/index.php/auth/login");

//login
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("hrm_user");

        driver.findElement(By.xpath("(//input)[3]")).sendKeys("Hrm_user@123");

        driver.findElement(By.xpath("//button")).click();

//click on PIm option
        driver.findElement(By.xpath("(//a)[3]")).click();


//        iterate over to find the row number of the desired id


        boolean notFound = true;
        while (notFound) {//false
            int count = 0;
            //get the id column
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (WebElement id : ids) {
//                change emplloyee id to the one that is available currently
                if (id.getText().equals("1048")) {
                    System.out.println("the row number is" + (count + 1));
//                click on the checkbox
                    String xpath = "//table/tbody/tr[" + (count + 1) + "]/td[1]";
                    WebElement checkBox = driver.findElement(By.xpath(xpath));
                    checkBox.click();
                    notFound = false;
                }
                count = count + 1;
            }
//            click on the next page
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}