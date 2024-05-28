package org.example.app;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

//java -jar PeriodicTextGenerator-1.0.0.jar count min bound delay period
public class TTextGenerator {
    private static final String letters = "ABCDEFGHIJKLMNOPRSTUVYZXW";//abcçdefgğhıijklmnoöprsştuüvyz
    private final Timer timer = new Timer();
    private static final Random rand = new Random();
    private final int min;
    private final int bound;
    private final int count;
    private final long delay;
    private final long period;
    private final TimeUnit timeUnit = TimeUnit.SECONDS;

    public TTextGenerator(int count,int min, int bound, int delay, int period) {
        this.min = min;
        this.bound = bound;
        this.count = count;
        this.delay = timeUnit.toMillis(delay);
        this.period = timeUnit.toMillis(period);
    }
    public TTextGenerator() {
        this(1,5,10,5000,1000);
    }
    private final String GenerateText()
    {
        String text="";
        for (int i = 0; i < rand.nextInt(min,bound); i++) {
            text += letters.charAt(rand.nextInt(24));
        }
        return text;
    }

    private void start()
    {
        timer.scheduleAtFixedRate(createTimerTask(),0,period);
        timer.schedule(stopTask(),delay);
    }

    private TimerTask createTimerTask()
    {
        return new TimerTask() {
            @Override
            public void run() {
                System.out.println(GenerateText());
            }
        };
    }
    private TimerTask stopTask()
    {
        return new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
            }
        };
    }
    public static void run(String[] args)
    {
        int count;
        int min ;
        int bound;
        int delay;
        int period;
        TTextGenerator t;
        //java -jar PeriodicTextGenerator-1.0.0.jar count min bound delay period
        try
        {
            count = Integer.parseInt(args[0]);
            min = Integer.parseInt(args[1]);
            bound = Integer.parseInt(args[2]);
            delay = Integer.parseInt(args[3]);
            period = Integer.parseInt(args[4]);
            t = new TTextGenerator(count,min,bound,delay,period);
        }
        catch(Exception ex)
        {
            t = new TTextGenerator();
        }

        t.start();
    }


}
