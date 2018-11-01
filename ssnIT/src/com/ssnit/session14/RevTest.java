package com.ssnit.session14;

import java.util.Scanner;

public class RevTest {
    public static void main(String[] args) {
        String original;
        String rev="";
        System.out.println("enter a string to reverse:");
        Scanner sc=new Scanner(System.in);
        original=sc.nextLine();
        char[] chars = original.toCharArray();
        char[] newCharArray = new char[chars.length];
        int j =0;
        for(int i=chars.length-1; i>=0; i--){
            newCharArray[j++] = chars[i];
        }
        System.out.println("New String :"+new String(newCharArray));
        //for()
        int len=original.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+original.charAt(i);
        }
        System.out.println("original string is :"+original);
        System.out.println("reverse string is:"+rev);
    }


}
