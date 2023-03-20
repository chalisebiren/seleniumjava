import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import org.apache.commons.math3.analysis.function.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeOutUntil {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        try{


            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
        //    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='login-button']")));
            driver.findElement(By.xpath("//*[@id='login-button']")).click();
            driver.findElement(By.xpath("//*[@id='register']")).click();
            driver.close();

    }catch (
    TimeoutException e) {
            System.out.println("Timeout");

    } }}


