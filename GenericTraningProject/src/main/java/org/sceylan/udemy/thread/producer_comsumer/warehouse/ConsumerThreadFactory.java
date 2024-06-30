package org.sceylan.udemy.thread.producer_comsumer.warehouse;

import java.util.concurrent.ThreadFactory;

public class ConsumerThreadFactory implements ThreadFactory {
    Runnable runnable;
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(runnable);
    }
}
