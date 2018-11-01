package com.ssnit.session17;

public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        System.out.println(threadTest.getState());
        threadTest.start();
    }

    @Override
    public void run() {
        System.out.println("In Run method");
    }
}
