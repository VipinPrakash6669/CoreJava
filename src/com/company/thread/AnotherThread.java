package com.company.thread;

import static com.company.thread.ThreadColor.ANSI_BLUE;

/*
Notes-------

Multithreading refers to two or more tasks executing concurrently within a single program
Thread is a unit of execution within a process
 */
public class AnotherThread extends Thread{

    @Override
    public void run()
    {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 10; i < 20; i++) {
            System.out.println(ANSI_BLUE+"AnotherThread extend thread Class Thread "+ i+" "+ Thread.currentThread().getName());
        }
        //System.out.println(ANSI_BLUE+"Hello from another thread");
    }
}
