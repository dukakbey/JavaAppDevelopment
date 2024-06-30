package org.sceylan.util.scheduler;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public abstract class Scheduler {
    private final Timer timer;
    private final TimerTask task;
    private final long duration;
    private final long period;
    private final long delay;
    private long counter;

    public Scheduler(long duration, long period)
    {
        this(duration,period, 0,TimeUnit.MILLISECONDS);
    }
    public Scheduler(long duration, long period, long delay,TimeUnit t) {
        this.timer = new Timer();
        this.duration = t == TimeUnit.MILLISECONDS? duration:t.toMillis(duration);
        this.period = period;
        this.delay = delay;
        counter = 0;
        task = createTimerTask();
    }


    private final TimerTask createTimerTask()
    {
        return new TimerTask() {
            public void run() {
                onTick();
                counter += period;
                if(counter < duration)
                    return;
                onFinish(); 
                timer.cancel();
            }
        };
    }
    public final Scheduler start()
    {
        timer.scheduleAtFixedRate(task,delay,period);
        return this;
    }
    protected abstract void onTick();
    protected abstract void onFinish();

}
