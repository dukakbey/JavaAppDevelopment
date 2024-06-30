package org.sceylan.udemy.thread.color;

public class App {
    public static void run()
    {
        Thread w1 = new Thread(new Countdown(),EnumColor.ANSI_BLUE.toString());
        Thread w2 = new Thread(new Countdown(),EnumColor.ANSI_RED.toString());
        Thread w3 = new Thread(new Countdown(),EnumColor.ANSI_YELLOW.toString());

        w1.start();
        try {
            w1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        w2.start();
        w3.start();
    }
}
