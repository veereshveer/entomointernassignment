package com.example.FileIOThreads;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
@Component
public class IOFileFunction {
    public void fileFunctions (){
        // create file
        try {
            File file = new File("D:\\newfile.txt");
      /*If file gets created then the createNewFile()
          method would return true or if the file is
          already present it would return false */
            boolean flag = file.createNewFile();
            if (flag) {
                System.out.println("File has been created successfully at the specified location");
            }
            else {
                System.out.println("File already present at the specified location");
            }
        }
        catch(IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
        // open files
        try {
            //constructor of the File class having file as an argument
            FileReader fr = new FileReader("D:\\newfile.txt");
            System.out.println("The file content is: ");
            int r = 0;
            while ((r = fr.read()) != -1) {
                System.out.print((char) r);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        // delete function
        try {
            File file = new File("D:\\newfile.txt");
//                boolean delete = file.delete();
//                System.out.println("\n File deleted = " + delete);
            if (file.delete())
            {
                System.out.println("\n File " + file.getName() + " is deleted");
            }
            else {
                System.out.println("\n Delete operation failed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
