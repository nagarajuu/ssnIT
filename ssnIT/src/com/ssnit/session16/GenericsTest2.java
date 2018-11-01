package com.ssnit.session16;

import java.util.ArrayList;

class Generics<T extends Number>{
    ArrayList <? extends Number> list = new ArrayList <>();
    T getValue(T e){
        return e;
    }

    static <X> X getSumValue(X ele1){
        return ele1;
    }



}
public class GenericsTest2 {
    public static void main(String[] args) {
        Generics<Integer> integerGenerics = new Generics <>();
        System.out.println(integerGenerics.getValue(new Integer(20)));
        System.out.println(Generics.getSumValue(new Integer(34)));


    }
}
