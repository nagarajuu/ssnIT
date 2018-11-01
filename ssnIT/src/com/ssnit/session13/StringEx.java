package com.ssnit.session13;

import java.util.StringTokenizer;

public class StringEx {
    public static void main(String[] args) {
        String s = new String("SSNIt");
        s.concat(" Solutions");
        System.out.println(s);

        char[] chars = s.toCharArray();

        for(char ch : chars){
            System.out.println(ch);
        }

        //String Buffer
        StringBuffer sb = new StringBuffer("SSNIt");
        sb.append(" Solutions");

        System.out.println(sb);

        String str = "as,fsd,asdweq,qweq";
        StringTokenizer stringTokenizer = new StringTokenizer(str,",");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }





    }
}
