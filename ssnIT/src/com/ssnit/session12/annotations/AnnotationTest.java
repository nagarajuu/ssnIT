package com.ssnit.session12.annotations;

class A{
    public void displayCaluclatedInterestvalue(){
        System.out.println("In A Method");
    }
}
class B extends A{
    @Override
    public void displayCaluclatedInterestvalue(){
        System.out.println("In Bs Method");
    }

    @Deprecated
    public void display(){
        System.out.println("In deprecated method");
    }
}
public class AnnotationTest {
    public static void main(String[] args) {
        B b = new B();
        b.displayCaluclatedInterestvalue();
        b.display();
    }
}
