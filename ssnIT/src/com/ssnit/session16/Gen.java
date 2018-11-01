package com.ssnit.session16;
import java.util.ArrayList;
public class Gen<T> {
    private T number1, number2,sum,product,difference;
    public void AddNumbers(T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public T getSum(T number1,T number2){

        return sum;
    }
    public void MultNumbers (T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public T getProd(){
        return product;
    }
    public void subtractNumbers (T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public T getDifference(){
        return difference;
    }

    public static void main(String[] args) {
        Gen<Integer> integerNumbers = new Gen<>();
        integerNumbers.AddNumbers(10, 5);
        System.out.println("The addition of two numbers is: "+integerNumbers.getSum(10,2));
        System.out.println("The mul of two numbers is: "+integerNumbers.getProd());
        System.out.println("The sub of two numbers is: "+integerNumbers.getDifference());

    }
}