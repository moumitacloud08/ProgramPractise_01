package org.example.thread.yield;

/**Every Operating system won't support yield method**/
public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
