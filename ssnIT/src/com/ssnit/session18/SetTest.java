package com.ssnit.session18;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet <>();

        stringSet.add("Abc");
        stringSet.add("Abc");
        stringSet.add("Xyz");
        stringSet.add("Caxqw");
        stringSet.add("Cwax");
        stringSet.add("QCaqx");
        stringSet.add("QwCax");

        for(String string: stringSet){
            System.out.println(string);
        }

        //System.out.println(stringSet);
    }
}
