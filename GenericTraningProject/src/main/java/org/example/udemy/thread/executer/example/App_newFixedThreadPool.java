package org.example.udemy.thread.executer.example;

import java.util.concurrent.Executors;

public class App_newFixedThreadPool {
    public static void run()
    {
        int count = 5;
        boolean startYellow = false;
        var blueExecuter = Executors.newFixedThreadPool(count,new ColorThreadFactory());
        for (int i = 0; i < count; i++) {
            blueExecuter.execute(new CountDown());
        }

        blueExecuter.shutdown();


    }
}
