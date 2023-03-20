package TestScripts;
import Pages.Login;
import Pages.Details;
import Pages.users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Login_Test extends Details  {
        WebDriver driver;

        @BeforeTest
        public void OpenBrowser(){
            Details Baseurl = new Details();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Baseurl.PageUrl);
        }

        @Test
         public void VerifyLogin() {
            Login login = new Login(driver);
            login.enterUsername("standard_user");
            login.enterPassword("secret_sauce");
            login.clickLogin();
        }
}



