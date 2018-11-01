package com.ssnit.session14;

public class NestedTry {
    public static void main(String[] args) throws ArithmeticException {
        int i=30,j=0;
        try{
            try {
                System.out.println("going to divide");
                int b = i/ j;
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
                j=5;
                System.out.println(i/j);
            }
            System.out.println("nested try");
        }
            catch(Exception e)
            {
                System.out.println("e");
            }
               System.out.println("executed successfully ");
    }
}
