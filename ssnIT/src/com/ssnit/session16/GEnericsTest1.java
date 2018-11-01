package com.ssnit.session16;

import java.util.ArrayList;

class GenericsTest<T>{
    ArrayList<T> list = new ArrayList<>();

    void addElement(T ele){
        list.add(ele);
    }

}

public class GEnericsTest1{
    public static void main(String[] args) {
        GenericsTest<String> list = new GenericsTest<>();
        list.addElement("abs");
        list.addElement("xyz");

        GenericsTest<Number> numberList = new GenericsTest<>();

        numberList.addElement(1);
        numberList.addElement(10.0);

        for(Number number: numberList.list){
            System.out.println(number);
        }

    }
}

