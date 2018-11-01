package com.ssnit.session19;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,23,43,23,2343,4,2);
        System.out.println(intList);
        OptionalInt inte =intList.stream().filter(i -> (i%2==0)).mapToInt(i -> i*10).reduce((a, b) -> a+b);
        System.out.println(inte.getAsInt());

        System.out.println("Traditional Format of for loop");
        for(int i =0; i<intList.size(); i++){
            System.out.println(intList.get(i));
        }

        System.out.println("For each loop");
        for(Integer in : intList){
            System.out.println(in);
        }

        System.out.println("Using streams");

        intList.stream().forEach(System.out::println);

    }

}
