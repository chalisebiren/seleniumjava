import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GetText {
    public static void main(String[] args){
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\birendra.chalise");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        String actualUrl = "https://www.saucedemo.com/";
        driver.get(actualUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        try{
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
            loginButton.click();
            WebElement expectedValue = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
           // Assert.assertNotNull("Sauce Labs Backpack not found", expectedValue);
            //driver.close();
        } catch (Exception e){
            System.out.println("Login Button not found");
        }
        List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));
        System.out.println("Number of elements :" +elements.size());
        for(int i=0; i<elements.size(); i++){
            System.out.println("Item text :" + elements.get(i).getAttribute("value"));
        }
        driver.close();
    }
}
