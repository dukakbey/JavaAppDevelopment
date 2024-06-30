package org.sceylan.udemy.thread.basicexample;

public class App{
    public static void run()
    {

        MyThread th = new MyThread();
        Thread rth = new Thread(new RunableThread());

        th.start();
        rth.start();

    }

}
