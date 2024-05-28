package org.example;

import com.karandev.util.console.Console;
import org.example.app.*;
import org.example.projects.countdownscheduler.CountDownScheduler;
import org.example.projects.countdownscheduler.CountDownSchedulerApp;
import org.example.util.time.DigitalClock;

public class Main {
    public static void main(String[] args) {
        CountDownSchedulerApp.run(args);
    }
}