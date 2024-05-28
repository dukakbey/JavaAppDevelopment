package org.example.projects.countdownscheduler;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

abstract public class CountDownScheduler
{
    private final long duration;
    private final long period;
    private final TimeUnit timeUnit;
    private final Timer timer;
    private long timeRemain;
    CountDownScheduler(long duration,long period,TimeUnit timeUnit)
    {
        this.duration = timeUnit == TimeUnit.MILLISECONDS ? duration:timeUnit.toMillis(duration);
        this.period =  timeUnit == TimeUnit.MILLISECONDS ? period:timeUnit.toMillis(period);;
        this.timeUnit = timeUnit;
        this.timeRemain =
                timeUnit == TimeUnit.SECONDS ? duration:timeUnit.toSeconds(duration);
        timer = new Timer();
    }
    CountDownScheduler(long duration,long period)
    {
        this(duration,period,TimeUnit.SECONDS);
    }

    protected abstract void onTick(long timeRemain);//The work to be done will be written at each step.
    protected abstract void onFinish();//What to do when the countdown ends
    private TimerTask createTimerTask()
    {
        return new TimerTask() {
            @Override
            public void run() {
                timeRemain--;
                onTick(timeRemain);
                if(timeRemain > 1)
                    return;
                this.cancel();

            }
        };
    }
    public void start()
    {
        timer.scheduleAtFixedRate(createTimerTask(),0,period);
    }
    public final void cancel()
    {
        onFinish();
        timer.cancel();
    }


}
