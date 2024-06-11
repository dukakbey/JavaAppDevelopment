package org.example.udemy.thread.executer;

import org.example.udemy.thread.multipleThreads.ThreadColor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class App {
    public static void run()
    {
        var blue = Executors.
                newSingleThreadExecutor(new ColorThreadFactory(ThreadColor.ANSI_BLUE));
        blue.execute(App::countDown);
    }
    public static void oldrun()
    {
        Thread red = new Thread(App::countDown,ThreadColor.ANSI_RED.name());
        Thread yellow = new Thread(App::countDown,ThreadColor.ANSI_YELLOW.name());
        Thread green = new Thread(App::countDown,ThreadColor.ANSI_GREEN.name());
        red.start();
        try {
            red.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        yellow.start();
        try {
            yellow.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        green.start();
        try {
            green.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void countDown()
    {
        String threadName = Thread.currentThread().getName();
        var threadColor = ThreadColor.ANSI_RESET;
        try{
        threadColor = ThreadColor.valueOf(threadName.toUpperCase());}
        catch (IllegalArgumentException ignore){};
        for (int i = 20; i > 0; i--) {
            System.out.println(threadColor.color()+threadName.
                    replace("ANSI_","")+" "+i);
        }

    }
}
