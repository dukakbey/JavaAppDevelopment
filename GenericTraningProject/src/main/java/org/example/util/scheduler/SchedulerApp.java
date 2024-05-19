package org.example.util.scheduler;

import java.util.concurrent.TimeUnit;

public class SchedulerApp {
    /*for CountDownScheduler*/
//    private static CountDownScheduler scheduler = new CountDownScheduler(10, 1, TimeUnit.SECONDS) {
//        @Override
//        protected void onFinish() {
//            System.out.println("process has finished.");
//        }
//
//        @Override
//        protected void onTick(long TimeRemained) {
//            System.out.println("on tick");
//        }
//    };

    private static final Scheduler scheduler = new Scheduler(5000,500) {
        @Override
        protected void onTick() {
            System.out.println("on tick");
        }

        @Override
        protected void onFinish() {
            System.out.println("on finish");
        }
    };
    public static void run()
    {
        scheduler.start();
    }


}
