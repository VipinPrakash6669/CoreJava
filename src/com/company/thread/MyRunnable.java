package com.company.thread;

import static com.company.thread.ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i =20; i < 30; i++) {
            System.out.println(ANSI_GREEN+"MyRunnable interface implemented Class Thread "+ i+" "+Thread.currentThread().getName());
        }

        //System.out.println(ANSI_GREEN+"In Runnable Interface thread");
    }
}
