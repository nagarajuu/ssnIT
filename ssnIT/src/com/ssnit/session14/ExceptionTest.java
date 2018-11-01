package com.ssnit.session14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args)  {
        int i = 10;
        int d = 0;
        try{
            FileOutputStream fos = new FileOutputStream("text.txt");
            String str = new String("SSNIT");
            fos.write(str.getBytes());
            System.out.println("In Try Block");
            System.out.println(i/d);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            d = 2;
            System.out.println(i/d);

        }finally {
            System.out.println("From finally block getDetails()");
            getDetails();
        }
    }
    public static void getDetails(){
        System.out.println("CAR entity details");
    }
}
