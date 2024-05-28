package org.example.app;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    static final Timer t = new Timer();

    public static void run()
    {
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        }, 0, 1000);
    }

}
