package com.ssnit.session13;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnno{
    String getItemName();
    double getPrice();

}


public class MyAnnoTest {
    public static void main(String[] args) {
        System.out.println("In MyAnnoTest");
        MyAnnoTest myAnnoTest = new MyAnnoTest();
        myAnnoTest.getAnnoDetails();

    }
    @MyAnno(getItemName = "Pen",getPrice=10.00)
    public void getAnnoDetails(){
        Class<? extends MyAnnoTest> myClass = this.getClass();
        Method method = null;
        try {
            method = myClass.getMethod("getAnnoDetails");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        MyAnno myAnno = method.getAnnotation(MyAnno.class);
        System.out.println("Item Name: "+ myAnno.getItemName() +
                "  and Its price:"+myAnno.getPrice());
    }
}
