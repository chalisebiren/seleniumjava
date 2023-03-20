import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LTest
{

    WebDriver driver = new ChromeDriver();
    @Test(priority = 1)
    public void loginToSauceDemo()
    {

        String actualUrl = "https://www.saucedemo.com/";
        driver.get(actualUrl);
        driver.manage().window().maximize();
        String username = System.getenv("SAUCE_DEMO_USERNAME");
        driver.findElement(By.id("user-name")).sendKeys(username);
        String password = System.getenv("SAUCE_DEMO_PASSWORD");
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Automation test execution in Chrome Browser");
    }
    @AfterMethod
    public void closeBrowser(){
    driver.close();
    }
}