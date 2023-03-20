package FileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("D:\\File1.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created " + myObj.getName());
            }else {
                System.out.println("File exists");
            }

        }catch (Exception e){
            System.out.println("Error occurred");
        }
    }
}
