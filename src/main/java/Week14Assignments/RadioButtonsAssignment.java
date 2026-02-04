package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        //choose your favorite beverages
        WebElement juice = driver.findElement(By.xpath("//input[@value='Juice']"));
        juice.click();

        //preferred working enviorment
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement radio = checkBoxes.get(i);

            String value = radio.getAttribute("value");
            System.out.println("Radio " + i + " value = " + value);

            if ("Hybrid".equalsIgnoreCase(value)) {
                System.out.println("Found Hybrid at index " + i + " -> clicking");
                Thread.sleep(2000);
                radio.click();
                break;

            }
        }
        //choose your favorite season
        WebElement enableRB = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enableRB.click();

        //Esnure spring button is enabled and select it
        WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
        Boolean springEnabled = spring.isEnabled();
        System.out.println("Spring button enabled? "+springEnabled);
        spring.click();

        //Winter button not displayed
        WebElement winter = driver.findElement(By.xpath("//input[@value='winter']"));
        Boolean winterDisplayed = winter.isDisplayed();
        System.out.println("Winter button displayed initially?:  "+winterDisplayed);

        //click on show button
        WebElement showButtons = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showButtons.click();

        //Verify winter option is displayed
        WebElement winterRecheck = driver.findElement(By.xpath("//input[@value='winter']"));
        Boolean winterDisplayedRecheck = winterRecheck.isDisplayed();
        System.out.println("Winter button displayed now? "+winterDisplayedRecheck);

        //Winter available for selection?
        WebElement clickWinter = driver.findElement(By.xpath("//input[@value='winter']"));
        Boolean winterClickable = clickWinter.isEnabled();
        System.out.println("Winter option is enabled? "+winterClickable);

        //Select lunch radio button
        WebElement lunch = driver.findElement(By.xpath("//input[@value='lunch']"));
        lunch.click();




        }


    }
