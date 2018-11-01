package com.ssnit.session16;
interface FunInterface3{
    default int getIntValue(int x){
        return x;
    }
    int getsubValue(int a, int b);

}
public class LmbdaSub {
    public static void main(String[] args) {

        FunInterface3 finInter = (a, b) -> {
            System.out.println("In Lamda Expression");
            return (a-b);
        };
        System.out.println(finInter.getIntValue(10));

        System.out.println("Sub: "+finInter.getsubValue(1234,5));
    }
}


