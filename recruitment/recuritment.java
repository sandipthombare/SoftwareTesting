package recruitment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;


import LOGINFUNCTIONALITY.LoginFn;

public class recuritment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TESTING-VSCODE-JAVA\\DEPENDENCIES\\chromedriver-win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        try{
            LoginFn.login(driver);
            R1(driver);
        }catch(Exception e){

        }    
    }
    public static void R1(WebDriver driver)throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));

        WebElement btn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")));
        btn1.click();
         
        Thread.sleep(3000);
        WebElement jobtitle = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]"));
        jobtitle.click();
        Thread.sleep(2000);
        // WebElement option = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
        
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-text-input']/following-sibling::div[contains(@class, 'oxd-select-dropdown-item')]"));

        // Iterate over the options and click on the one with the desired text
        String desiredOptionText = "Chief Executive Officer";
        for (WebElement option : options) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break; // Exit the loop after clicking on the desired option
            }
        }
    }
    
}
