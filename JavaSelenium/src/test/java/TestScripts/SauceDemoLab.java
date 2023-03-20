package TestScripts;
import Pages.Checkout;
import Pages.Details;
import Pages.HomePage;
import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SauceDemoLab {
    WebDriver driver;
    @BeforeSuite
    public void OpenBrowser(){
        Details Baseurl = new Details();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Baseurl.PageUrl);
        System.out.println("Chrome Drive start successfully");
    }

    @Test(priority = 1)
    public void VerifyLogin() {
        Login login = new Login(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
    }
    @Test(priority = 2)
    public void VerifyAddToCart() {
        HomePage ProductSelected = new HomePage(driver);
        ProductSelected.AddToCart();
    }
    @Test(priority = 3)
    public void VerifyShoppingCartCheckout() {
        HomePage ViewCart = new HomePage(driver);
        ViewCart.ShoppingCart();

    }

    @Test(priority = 4)
    public void VerifyCheckout() {
        Checkout CheckoutCarts = new Checkout(driver);
        CheckoutCarts.CheckoutItem();
    }
    @Test(priority = 5)
    public void EnterDetail() {
        Checkout CheckoutCarts = new Checkout(driver);
        CheckoutCarts.EnterDetail("Biren", "KTM", "44200");
        CheckoutCarts.ClickContinue();
    }
    @Test(priority = 6)
    public void BackToHome() {
        Checkout CheckoutCarts = new Checkout(driver);
        CheckoutCarts.ClickFinish();
        CheckoutCarts.BackToHome();
    }

    @AfterSuite
    public void closeBrowser(){
        if(driver!=null) {
            driver.close();
        }
    }
}

