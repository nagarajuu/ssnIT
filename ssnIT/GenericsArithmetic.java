package com.genericsexample;
public class GenericsArithmetic<T> {
    private T number1, number2,sum,product,difference;
    public void AddNumbers(T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;     
    }
    public T getSum(){
//      sum = number1 + number2;
//      when I uncomment the above line I am getting this error message.The operator + is undefined for the argument type(s) T, T
        return sum;
    }
    public void MultNumbers (T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
//      product = number1 + number2;
    }
    public T getProd (){
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
        GenericsArithmetic<Integer> integerNumbers = new GenericsArithmetic<>();
        integerNumbers.AddNumbers(100, 100);
        System.out.println("The addition of two numbers is: "+integerNumbers.getSum());
    }
}
