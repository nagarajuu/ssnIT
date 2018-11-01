package com.ssnit.session15;
import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        File f = null;
        boolean boole = false;

        try {
            f = new File("C:/test.txt");
            boole = f.exists();

            if(boole) {
                boole = f.setWritable(true, false);
                System.out.println("setWritable() succeeded?: "+boole);
                boole  = f.canWrite();
                System.out.print("Is file writable?: "+boole);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

