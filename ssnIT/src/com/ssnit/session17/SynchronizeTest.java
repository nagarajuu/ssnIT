package com.ssnit.session17;

class ResourceObject{
    public synchronized void getValues(){
        for(int i = 0; i<10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread1 extends Thread{
    ResourceObject resourceObject;
    Thread1(ResourceObject resourceObject){
        this.resourceObject = resourceObject;
    }
    @Override
    public void run() {
        resourceObject.getValues();
    }
}
class Thread2 extends Thread{
    ResourceObject resourceObject;
    Thread2(ResourceObject resourceObject){
        this.resourceObject = resourceObject;
    }

    @Override
    public void run() {
        resourceObject.getValues();
    }
}
public class SynchronizeTest {
    public static void main(String[] args) {
        ResourceObject resourceObject = new ResourceObject();
        Thread1 thread1 = new Thread1(resourceObject);
        Thread2 thread2 = new Thread2(resourceObject);
        thread1.start();
        thread2.start();
    }

}
