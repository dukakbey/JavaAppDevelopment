package org.sceylan.util.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock {
    private static Timer timer;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");
    private static TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.printf("%s\r",formatter.format(LocalDateTime.now()),"\n");
        }
    };
    public static void run()
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(task,0,1000);
    }


}