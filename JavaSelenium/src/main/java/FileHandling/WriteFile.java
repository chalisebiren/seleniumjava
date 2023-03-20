package FileHandling;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("D:\\File1.txt");
            myWriter.write("Writing...............");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
