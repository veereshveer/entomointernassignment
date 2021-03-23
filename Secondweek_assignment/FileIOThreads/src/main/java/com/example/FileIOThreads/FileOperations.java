package com.example.FileIOThreads;

import jdk.nashorn.internal.ir.debug.ClassHistogramElement;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class FileOperations {

    public void fileOperations() {
        File file = new File("D:\\newfile.txt");
        try {
            boolean createNewFile = file.createNewFile();
            System.out.println("File Created = "+createNewFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("D:\\newfile.txt"));
            String data = "Veeresh Joined as a intern in EPMS team";
            os.write(data.getBytes(), 0, data.length());

//checking file permissions for application user
            System.out.println("File is readable? "+file.canRead());
            System.out.println("File is writable? "+file.canWrite());
            System.out.println("File is executable? "+file.canExecute());

//changing file permissions
            file.setReadable(false);
            file.setWritable(false);
            file.setExecutable(false);

//change file permissions for other users also
            file.setReadable(true, false);
            file.setWritable(true, false);
            file.setExecutable(true, true);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // open files
        try {
            FileReader fr = new FileReader("D:\\newfile.txt");
            System.out.println("The file content is: ");
            int r = 0;
            while ((r = fr.read()) != -1) {
                System.out.print((char) r);
            }
            fr.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

