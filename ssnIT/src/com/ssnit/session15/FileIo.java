package com.ssnit.session15;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class FileIo {
    public static void main(String[] args) {

        File sourceFile=new File("E:\\ssnIT\\THEJA.txt");
        File destinationFile=new File("E:\\ssnIT\\test.txt");
        try{
            Files.copy(sourceFile.toPath(),destinationFile.toPath());
        }catch (IOException ie){
            ie.printStackTrace();
            System.out.println("file copied");
        }
        File file=new File("E:\\ssnIT\\text.txt");
        if(file.delete()){
            System.out.println(file+"file deleted");
        }else{
            System.out.println("file not deleted");
        }
        File file1=new File("E:\\ssnIT\\THEJA.txt");
        if(file1.exists()){
            double bytes=file1.length();
            System.out.println("file length is"+bytes);
        }
    }
}
