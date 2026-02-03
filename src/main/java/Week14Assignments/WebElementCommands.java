package Week14Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {

        //declare instance
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //Retrieve attribute
        WebElement text = driver.findElement(By.xpath("//div[@id='textattr']"));
        String textRead = text.getText();
        System.out.println(textRead);

        //Meal preference
        WebElement checkBox = driver.findElement(By.xpath("//input[@name='MealRadio']"));
        Boolean musicFestival = checkBox.isEnabled();
        System.out.println("Music Festival option is enabled: " + musicFestival);
        checkBox.click();

        //Tech talk is disabled
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        Boolean techTalk = checkBox2.isEnabled();
        System.out.println("Tech Talk option is enabled: "+techTalk);

        //Slow down - For submitting purposes only, I know not to use this during work
        Thread.sleep(2000);

        //Show more Options button
        WebElement showMore = driver.findElement(By.xpath("//button[@onClick='toggleHiddenRadio(event)']"));
        showMore.click();
        //art exibition option displayed
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        Boolean artExhibition = checkbox3.isDisplayed();
        System.out.println("Art exhibition option is displayed: "+artExhibition);
        checkbox3.click();

        //Retrieve attribute from Mystery message text
        WebElement text2 = driver.findElement(By.xpath("//div[@title='Hover over me to reveal the secert']"));
        String textRead2 = text2.getAttribute("title");
        System.out.println(textRead2);

        //option box - if checkbox 1 is enabled , click on it
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean optionBoxCB1 = checkBox3.isEnabled();
        if (optionBoxCB1==true){
            checkBox3.click();
        }

        //option Box = check checkbox 2 is disabled
        WebElement optionBoxCheckbox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        Boolean optionBoxCB2 = optionBoxCheckbox2.isEnabled();
        System.out.println("Checkbox 2 in Option Boxes section is enabled: "+optionBoxCB2);

        //Input FIeld - clear field and send text
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        //Slow down - For submitting purposes only, I know not to use this during work
        Thread.sleep(2000);
        //Send new keys
        inputField.sendKeys("here is the custom text entered");


    }
}
