package SeleniumProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabs {
    static WebDriver driver;
    static String basiURL = "https://www.saucedemo.com/";
    @BeforeTest
    static void openURl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    static void Standard_User(){
        driver.get(basiURL);
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
    }
    @Test
    static void locked_Out_User(){
        driver.get(basiURL);
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("locked_out_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
    }
    @Test
    static void problem_User(){
        driver.get(basiURL);
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("problem_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
    }
    @Test
    static void performance_Glitch_User(){
        driver.get(basiURL);
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("performance_glitch_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
    }
    @AfterTest
    static void closeBrowser(){
        driver.quit();
    }

}
