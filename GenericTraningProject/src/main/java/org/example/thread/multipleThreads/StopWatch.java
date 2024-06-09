package org.example.thread.multipleThreads;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    TimeUnit timeUnit;
    public StopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown(int duration) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        for (int i = duration; i > 0; i--) {
            try
            {
                ThreadColor threadColor = ThreadColor.valueOf(threadName);
                System.out.println(threadColor.color()+i);
                timeUnit.sleep(1);
            }
            catch(InterruptedException ignore)
            {

            }
        }
    }
    public void countDown() {
        try{
            countDown(5);
        }
        catch (InterruptedException ignore)
        {

        }
    }
}
