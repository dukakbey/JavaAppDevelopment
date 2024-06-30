package org.sceylan.udemy.thread.color;

public class Countdown implements Runnable{
    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println(EnumColor.
                    valueOf(Thread.currentThread().getName()).getColorCode() + Thread.currentThread().getName().
                    replace("ANSI_","")+" worker: "+i);
        }

    }
}
