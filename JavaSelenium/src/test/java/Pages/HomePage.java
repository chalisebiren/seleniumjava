package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By AddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By ShoppingCart= By.className("shopping_cart_link");

    public void AddToCart(){
        driver.findElement(AddToCart).click();
    }
    public void ShoppingCart(){
        driver.findElement(ShoppingCart).click();
    }

}
