package com.ssnit.session16;
    interface FunInterface2{
        default int getIntValue(int x){
            return x;
        }
        int getsumValue(int a, int b);


    }
    public class LamdaTest1 {
        public static void main(String[] args) {

            FunInterface2 finInter = (a, b) -> {
                System.out.println("In Lamda Expression");
                return (a+b);
            };



            System.out.println(finInter.getIntValue(10));

            System.out.println("Sum: "+finInter.getsumValue(10,2));
        }
    }

