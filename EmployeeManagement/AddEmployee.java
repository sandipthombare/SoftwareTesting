package EmployeeManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import LOGINFUNCTIONALITY.LoginFn;

public class AddEmployee {
    public static void main(String args[])throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\TESTING-VSCODE-JAVA\\DEPENDENCIES\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            LoginFn.login(driver);
            AddRecord(driver);
        }catch (Exception e) {
            System.out.println("Execution error");
        }
    }

    public static void AddRecord(WebDriver driver)throws Exception{
        
            

            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            WebElement AddButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")));
            AddButton.click();
            Thread.sleep(3000);

            

            WebElement FirstName = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName")));
            FirstName.sendKeys("sandip");

            WebElement MiddleName = driver.findElement(By.name("middleName"));
            MiddleName.sendKeys("subhash");

            WebElement LastName = driver.findElement(By.name("lastName"));
            LastName.sendKeys("Thombare");

            WebElement switchElement = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
            switchElement.click();

            WebElement Username = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
            Username.sendKeys("sandip101");

            WebElement Status = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label"));
            Status.click();


            WebElement Password = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
            Password.sendKeys("Sandip@123");

            WebElement CPassword = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
            CPassword.sendKeys("Sandip@123");

            WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
            saveBtn.click();

            //Personal Details
            WebElement License = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")));
            License.sendKeys("sandipthombare123a");

            WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
            dropdown.sendKeys("2030-09-05");

            WebElement Nationality = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"));
            Nationality.click();
            // Select select = new Select(Nationality);
            Nationality.sendKeys("Indian");

            // select.selectByValue("Indian");

            WebElement MartialStatus = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"));
            // Select select1 = new Select(MartialStatus);
            // select1.selectByVisibleText("Single");
            MartialStatus.click();
            MartialStatus.sendKeys("Single");

            WebElement DOB = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/i"));
            DOB.sendKeys("1999-05-03");

            WebElement GenderMale = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
            GenderMale.click();

            WebElement saveBtn1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
            saveBtn1.click();
            
            WebElement BloodType = driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")));
            BloodType.click();
            
            WebElement BloodTypeName = driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")));
            BloodTypeName.sendKeys("Sandip");
            
            WebElement saveBtn2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
            saveBtn2.click();


            Thread.sleep(3000);

    }




}
