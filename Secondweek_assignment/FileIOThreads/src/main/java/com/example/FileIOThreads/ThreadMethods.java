package com.example.FileIOThreads;

import org.springframework.stereotype.Component;

public class ThreadMethods {


    static class thread implements Runnable
    {
        public void run()
        {
            try
            {
                Thread.sleep(1500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("State of thread1 while it called join() method on thread2 -"+
                    Test.thread1.getState());
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static class Test implements Runnable
    {
        public static Thread thread1;
        public static Test obj;

        public static void main (String[] args)
        {
            obj = new Test();
            thread1 = new Thread(obj);

            System.out.println("State of thread1 after creating it - " + thread1.getState());
            thread1.start();
            System.out.println("after starting thread isAlive: "+thread1.isAlive());

            System.out.println("State of thread1 after calling .start() method on it - " +
                    thread1.getState());
        }

        public void run()
        {
            thread myThread = new thread();
            Thread thread2 = new Thread(myThread);

            System.out.println("State of thread2 after creating it - "+ thread2.getState());
            thread2.start();
            System.out.println("after starting thread isAlive: "+thread2.isAlive());

            System.out.println("State of thread2 after calling .start() method on it - " +
                    thread2.getState());

            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("State of thread2 after calling .sleep() method on it - "+
                    thread2.getState() );


            try
            {
                thread2.join();
                System.out.println("after starting thread isAlive: "+thread2.isAlive());

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("State of thread2 when it has finished it's execution - " +
                    thread2.getState());
        }

    }

}
