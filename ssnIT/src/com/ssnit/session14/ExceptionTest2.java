package com.ssnit.session14;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class ExceptionTest2{
    public static void main(String[] args) {
        try{
            int i=10;
            int d=0;
            if(d>0){
                System.out.println(i/d);
            }else{
                throw new CustomizedException();
            }
        }catch (CustomizedException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("From finally block");
        }
    }
}
