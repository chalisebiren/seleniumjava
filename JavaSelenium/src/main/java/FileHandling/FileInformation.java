package FileHandling;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File myObj = new File("D:\\File1.txt");
        if(myObj.exists()){
            System.out.println("File Name:" + myObj.getName());
            System.out.println("Path :" + myObj.getAbsolutePath());
            System.out.println("Writable :" + myObj.canWrite());
            System.out.println("Readable: "+ myObj.canRead());
            System.out.println("File Size in Bytes" + myObj.length());

        }else {
            System.out.println("File Does not exist");
        }


    }
}
