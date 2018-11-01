package com.ssnit.session15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

public class FileIOEx {
    private static final Object ABC = "ee";

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\ssnIT\\text.txt");

        if(file.exists()){
            System.out.println("File is available:"+ file.getAbsolutePath());
        }else{
            System.out.println("File is not available");
            boolean created = file.createNewFile();
            System.out.println("File created: "+created);
        }

        FileInputStream fileInputStream = new FileInputStream(file);

        int temp = 0;
        while((temp=fileInputStream.read()) != -1){
            System.out.print((char)temp);
        }

        String str = "SSNIT Solutions123";

        File destFile = new File("E:\\ssnIT\\ABC.txt");
        if(!destFile.exists()){
            destFile.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);
        fileOutputStream.write(str.getBytes());
        if(destFile.exists()) {
            file.delete();
        }
        String str1 = "SSNIT";

        File destFile1 = new File("E:\\ssnIT\\THEJA.txt");
        if(!destFile1.exists()){
            destFile1.createNewFile();
        }

    }

}
