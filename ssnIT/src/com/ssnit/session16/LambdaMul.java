package com.ssnit.session16;
interface FunInterface4{
    default int getIntValue(int x){
        return x;
    }
    int getmulValue(int a, int b);

}
public class LambdaMul {
    public static void main(String[] args) {

        FunInterface4 finInter = (a, b) -> {
            System.out.println("In Lamda Expression");
            return (a*b);
        };
        System.out.println(finInter.getIntValue(10));

        System.out.println("Mul: "+finInter.getmulValue(1340,5));
    }

}
