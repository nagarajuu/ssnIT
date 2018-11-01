package com.ssnit.session16;

@java.lang.FunctionalInterface
interface FunctionalInterface<T>{
    T getValue(T a);
    default void getvalue(){
        System.out.println("in default method");
    }
}
public class LamdaTest2 {
    public static void main(String[] args) {
        displayValue((a) ->{return a;});

        displayValue((a) ->{
            System.out.println("In Lamda");
            return a;});

    }

    static void displayValue(FunctionalInterface functionalInterface){
        System.out.println(functionalInterface.getValue(10));
        System.out.println(functionalInterface.getValue("String in Lamda"));
    }

}
