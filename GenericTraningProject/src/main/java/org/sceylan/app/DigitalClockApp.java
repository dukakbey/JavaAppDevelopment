package org.sceylan.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class DigitalClockApp {
    static final Timer t = new Timer();
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");

    static public void run()
    {
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.printf("%s\r",formatter.format(LocalDateTime.now()),"\n");
            }
        },0,1000);
    }

}
