package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    //Called when object created
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for username, Password and login button
    By Username = By.id("user-name");
    By Password = By.id("password");
    By loginBtn = By.id("login-button");

    //Enter username method
    public void enterUsername(String user) {
        driver.findElement(Username).sendKeys(user);
    }

    //Enter password
    public void enterPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    //click on Login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}