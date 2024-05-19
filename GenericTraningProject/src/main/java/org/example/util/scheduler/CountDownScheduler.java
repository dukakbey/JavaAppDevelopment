package org.example.util.scheduler;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

abstract  public class CountDownScheduler {
    private final long duration;
    private final long period;
    private final Timer timer;

    public CountDownScheduler(long duration, long period, TimeUnit timeUnit) {
        this.duration = timeUnit == TimeUnit.MILLISECONDS ? duration : timeUnit.toMillis(duration);
        this.period = timeUnit == TimeUnit.MILLISECONDS ? period : timeUnit.toMillis(period);
        this.timer = new Timer();
    }
    public CountDownScheduler(long duration, long period) {
        this(duration,period,TimeUnit.MILLISECONDS);
    }
    private TimerTask createTimerTask()
    {
        return new TimerTask() {
            int val;
            public void run() {
                try
                {
                    onTick(duration - val);
                    val += period;
                    if(duration > val)
                        return;
                    onFinish();
                    timer.cancel();
                }
                catch (Exception ignore)
                {

                }
            }
        };
    }
    public final CountDownScheduler start()
    {
        timer.scheduleAtFixedRate(this.createTimerTask(),0,period);
        return this;
    }
    public void cancel()
    {
        timer.cancel();
    }
    abstract  protected void onFinish();
    abstract protected void onTick(long TimeRemained);

}
