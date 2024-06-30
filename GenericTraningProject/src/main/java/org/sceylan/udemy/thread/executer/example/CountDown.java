package org.sceylan.udemy.thread.executer.example;

public class CountDown implements Runnable{
    String threadColor = EnumColor.ANSI_RESET.getColorCode();
    @Override
    public void run() {
        try{
            threadColor = EnumColor.
                    valueOf(Thread.currentThread().getName()).getColorCode();
        }
        catch(IllegalArgumentException ignore)
        {

        }

        for (int i = 20; i > 0; i--) {
            System.out.println(
                    threadColor+ Thread.currentThread().getName().
                    replace("ANSI_","")+" worker: "+i);
        }

    }
}
