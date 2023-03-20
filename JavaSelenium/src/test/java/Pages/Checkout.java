package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;
    public Checkout(WebDriver driver) {
        this.driver=driver;
    }

    By CheckoutButton = By.id("checkout");
    By EnterName = By.id("first-name");
    By EnterLastname = By.id("last-name");
    By EnterPostal = By.id("postal-code");
    By ClickContinue= By.id("continue");
    By ClickFinish = By.id("finish");
    By BackToHome = By.id("back-to-products");
    public void CheckoutItem(){
        driver.findElement(CheckoutButton).click();
    }
    public void EnterDetail (String name, String lname, String postal) {
        driver.findElement(EnterName).sendKeys(name);
        driver.findElement(EnterLastname).sendKeys(lname);
        driver.findElement(EnterPostal).sendKeys(postal);
    }
    public void ClickContinue(){
        driver.findElement(ClickContinue).click();
    }
    public void ClickFinish(){
        driver.findElement(ClickFinish).click();
    }
    public void BackToHome(){
        driver.findElement(BackToHome).click();
    }

}
