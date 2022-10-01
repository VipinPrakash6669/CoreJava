package com.company.Main;

import com.company.thread.AnotherThread;
import com.company.thread.MyRunnable;

import java.util.Objects;

import static com.company.thread.ThreadColor.ANSI_PURPLE;
import static com.company.thread.ThreadColor.ANSI_RED;

/*
Notes----
Runnable Interface
    It also used to create thread and should be used if you are only planning
    to override the run() method and no other Thread methods.
sleep
    The method sleep() is being used to halt the working of a thread for a given amount of time

 */
public class MainThread {
    public static void main(String[] args) {
        //System.out.println(ANSI_PURPLE+"hello from the main thread");
//=====================================================================================
        //Thread class thread

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Extend Thread");
        anotherThread.start();
        System.out.println(ANSI_RED+"Thread status "+anotherThread.getState());

        //System.out.println(ANSI_PURPLE+"hello again from main thread");

//=========================================================================================
        //Runnable interface thread
        /*
            Some important concept to remember
                We have to attach code what we want to run using thread by passing object of our class MyRunnable in
                Thread constructor
                But thread constructor only accept the reference of runnable interface due to variety of man made classes
                To overcome this problem we use the concept of interface that reference variable of interface
                can hold the reference of the object of that class that implements that interface
                For that we have to make class and implement inside it the runnable interface
                We can only pass the Runnable interface reference variable in the thread constructor

                The only advantage of creating a thread using Runnable interface is we space for the class to extend
                another class because we extending the thread calss in the 2nd method
         */
        //Save the reference of  MyRunnable interface in the reference variable of the interface
        Runnable runnable= new MyRunnable();
        //Create the object of the Thread class and pass above reference in thread constructor
        Thread myRunnableThread = new Thread(runnable);
        myRunnableThread.setName("Implement Thread");
        myRunnableThread.start();

//====================================================================================================
        //Thread creation by lambda expression by implementing the run method of runnable class using Lambda
        //Expression
        Thread threadd = new Thread(()-> {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Lambda Expression Thread");
        });
        threadd.start();

//==========================================================================================
        //Main thread
        // To sleep
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("Main Thread");
        //to suspend main thread until runnable thread totally executed
//        try {
//            myRunnableThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ANSI_PURPLE+"Main Class Thread "+ i+" "+Thread.currentThread().getName());
        }
        System.out.println(ANSI_RED+"Thread status "+anotherThread.getState());

    }
}
