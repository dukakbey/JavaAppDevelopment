package org.example.thread.multipleThreads;

import java.util.concurrent.TimeUnit;

public class ThreadColorApp {
    public static void run()
    {
        StopWatch s1 = new StopWatch(TimeUnit.SECONDS);

        Thread t1 = new Thread(s1::countDown,ThreadColor.ANSI_GREEN.name());
        Thread t2 = new Thread(()-> {
            try {
                s1.countDown(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },ThreadColor.ANSI_YELLOW.name());
        Thread t3 = new Thread(s1::countDown,ThreadColor.ANSI_RED.name());

        t1.start();
        t2.start();
        t3.start();


    }
}
