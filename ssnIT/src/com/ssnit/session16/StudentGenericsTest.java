package com.ssnit.session16;

import java.util.ArrayList;
import java.util.List;

public class StudentGenericsTest {
    int st_no;
    List<Integer> st_marks;

    public static void main(String[] args) {
        StudentGenericsTest st1 = new StudentGenericsTest();
        st1.st_no = 001;
        st1.st_marks = new ArrayList();
        st1.st_marks.add(79);
        st1.st_marks.add(80);
        st1.st_marks.add(80);
        Integer sum =0;
        for(Integer num: st1.st_marks){
            sum = sum+num;
        }


        System.out.println(sum);

    }
}
