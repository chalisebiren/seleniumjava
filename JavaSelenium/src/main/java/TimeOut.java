
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TimeOut {
        public static void main(String[] args) {
            try {
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(0));
                driver.get("https://www.shutterstock.com/image-illustration/artistic-abstract-background-texture-painted-wallpaper-1560049877");
            }catch (TimeoutException e) {
               System.out.println("Took more than 1 second");
            }
        }
    }

