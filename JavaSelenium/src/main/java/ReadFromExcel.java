import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
    public static  void main(String args[]) throws IOException {

        //Create an object of File class to open xlsx file
        File file =    new File("D:\\user\\creds.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet_one=wb.getSheet("user_list");

        //Create a row object to retrieve row at index 1
        XSSFRow row_two=sheet_one.getRow(1);

        //Create a cell object to retrieve cell at index 0
        XSSFCell user=row_two.getCell(0);

        //Create a cell object to retrieve cell at index 1
        XSSFCell password=row_two.getCell(1);

        //Get the credentials in to variables
        String username= user.getStringCellValue();
        String pass =password.getStringCellValue();

        //initializing web driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //passing username and password
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pass);

        //login button click
        driver.findElement(By.name("login-button")).click();
    }
}