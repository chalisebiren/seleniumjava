package Pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class users {
    public static  void main(String args[]) throws IOException {

        //Create an object of File class to open xlsx file
        File file =    new File("D:\\user\\creds.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("user_list");

        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(1);
        //Create a cell object to retrieve cell at index 2
        XSSFCell user=row2.getCell(0);
        XSSFCell password=row2.getCell(1);
        //Get the address in a variable
       String username= user.getStringCellValue();
       String pass =password.getStringCellValue();

        //Printing the user
        System.out.println("Username :"+ username);
        System.out.println("Password :"+ pass);


    }
}