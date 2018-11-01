package com.ssnit.session16;
interface FunInterface8{

    default int getIntValue(int x){
        return x;
    }
    int getfactValue(int a);

}

public class LambdaFact {
    public static void main(String[] args) {

        FunInterface8 finInter = (a) -> {
            int fact=1;
            for(int i=1;i<=a;i++) {
                fact = fact * i;
            }
            return (fact);
        };
        System.out.println(finInter.getIntValue(10));
        System.out.println("factorial of 5: "+finInter.getfactValue(5));
    }


}
