package com.ssnit.session17;

public class DeadLockTest {
    static Object object1 = new Object();
    static Object object2 = new Object();
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

    private static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("Resource Object1 holds lock");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("trying to hold locks on resource Object1");
                synchronized (object2){
                    System.out.println("Resource Object1 and Object2 holds lock");
                }
            }
        }
    }

    private static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("Resource Object2 holds lock");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("trying to hold locks on resource Object2");
                synchronized (object2){
                    System.out.println("Resource Object1 and Object2 holds lock");
                }
            }
        }
    }
}
