import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisTest {
    String food;
    String size;

    public void setData(String food, String size){
        this.food = food;
        this.size=size;
    }
    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        t.setData("Pizza", "Large");
        System.out.println(t.food +"\n" + t.size);
    }


    public static class AND_ {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
          //  driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id='user-name' or @id='password']")).sendKeys("standard_user");
            driver.findElement(By.xpath("//*[@id='password' and @name='password']")).sendKeys("secret_sauce");
        }
    }


}
