package com.example.FileIOThreads;

import org.springframework.stereotype.Component;

@Component
public class CreateThread {
    static class Multi extends Thread{
        public void run(){
            System.out.println("thread Thread is running...");
        }

    }
    static class Multi3 implements Runnable {
        public void run() {
            System.out.println("thread Runnable is running...");
        }
    }
    public  void createThread(){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);
        t1.start();
        Multi t2=new Multi();
        t2.start();

    }
}