package org.example.udemy.thread.executer.example;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App_newSingleThreadExecutor {
    public static void run()
    {
        boolean startYellow = false;
        var blueExecuter = Executors.newSingleThreadExecutor(new ColorThreadFactory(EnumColor.ANSI_BLUE));
        blueExecuter.execute(new CountDown());
        blueExecuter.shutdown();
        try {
            startYellow = blueExecuter.awaitTermination(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(startYellow)
        {
            var yellowExecuter = Executors.newSingleThreadExecutor(new ColorThreadFactory(EnumColor.ANSI_YELLOW));
            yellowExecuter.execute(new CountDown());
            yellowExecuter.shutdown();
        }
        else {
            System.out.println("blue not done");
        }

    }
}
