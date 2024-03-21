package LOGINFUNCTIONALITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginFn {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\TESTING-VSCODE-JAVA\\DEPENDENCIES\\chromedriver-win32\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        username.sendKeys("Admin");
        
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement button=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        button.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
