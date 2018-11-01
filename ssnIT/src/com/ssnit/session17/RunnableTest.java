package com.ssnit.session17;

public class RunnableTest{
    public static void main(String[] args) {
       /* Runnable runnable = () -> {
            System.out.println("Thread Running");
        };*/
        Thread thread = new Thread(() -> {
            System.out.println("Thread Running");
        });
        thread.start();
    }

}
