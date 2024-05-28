package org.example.projects.countdownscheduler;

public class CountDownSchedulerApp {
    private static long duration;
    private static long period;
    public static void run(String[] args)
    {
        try
        {
            duration = Integer.parseInt(args[0]);
            period = Integer.parseInt(args[1]);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        CountDownScheduler scheduler = new CountDownScheduler(duration,period) {
            @Override
            protected void onTick(long timeRemain) {
                System.out.println(timeRemain);
            }

            @Override
            protected void onFinish() {
                System.out.println("finished..");
            }
        };
        scheduler.start();
    }

}
