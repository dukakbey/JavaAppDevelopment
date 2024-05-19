package org.example.app;

import org.example.app.TextApp;

import java.util.Timer;
import java.util.TimerTask;

public class PeriodicTextGeneratorApp {

    private static final Timer t = new Timer();
    public static void run(String[] args)
    {
        int count = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int bound = Integer.parseInt(args[2]);
        int delay = Integer.parseInt(args[3]);
        int period = Integer.parseInt(args[4]);
        TimerTask task = new TimerTask() {
            int n;
            @Override
            public void run() {
                if(n++ != count)
                    TextApp.run(min,bound);
                else
                    t.cancel();
            }
        };
        t.scheduleAtFixedRate(task,delay,period);
    }

}
