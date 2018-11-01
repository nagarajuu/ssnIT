package com.ssnit.session18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List <String> list = new LinkedList <>();

        list.add("Abc");
        list.add("qwe");
        System.out.println(list);
        List <String> list1 = new ArrayList <>();

        list1.add("Abc");
        list1.add("qwe1");

        list.addAll(list1);
        list.remove("qwe1");
        System.out.println(list);





    }
}
