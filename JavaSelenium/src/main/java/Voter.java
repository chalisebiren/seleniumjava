
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Voter {

    public static void main(String[] args) {
        try {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = UserInput.nextInt();
            if (age < 18)
                System.out.println("You have to be 18 to be on voter list");
                else System.out.println("Congratulation! You made it to the Voter list");
        } catch (Exception a) {
            System.out.println("Age should a number");
        }
    }

    public static class AND_OR {

        public static void main(String[] args) {
            WebElement w,x;
            WebDriver driver = new ChromeDriver();


            // Launch the application
            driver.get("https://demo.guru99.com/v1/");

            //Search element using OR in the xpath
            w=driver.findElement(By.xpath("//*[@type='submit' OR @name='btnReset']"));

            //Print the text of the element
            System.out.println(w.getText());

            //Search element using AND in the xpath
            x=driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']"));

            //Print the text of the searched element
            System.out.println(x.getText());

            //Close the browser
            driver.quit();
        }

    }

    public static class title {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            //Page Title
            String Title = driver.getTitle();
            String expectedTitle = "Swag Labs";
            if (Title.equalsIgnoreCase(expectedTitle))
                System.out.println("Title Matched");
            else
                System.out.println("Title didn't match");
        }
    }

    public static class SystemProperty {

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

    //        String username = System.getProperty("user.name");
    //        driver.findElement(By.id("user-name")).sendKeys(System.getProperty("user.name"));
    //        driver.findElement(By.id("user-name")).sendKeys(System.getenv("user.name"));
    //
    //        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    //        driver.findElement(By.name("login-button")).click();

            String username = System.getenv("user.name");
            driver.findElement(By.id("user-name")).sendKeys(System.getProperty("user.name"));



        }
    }
}