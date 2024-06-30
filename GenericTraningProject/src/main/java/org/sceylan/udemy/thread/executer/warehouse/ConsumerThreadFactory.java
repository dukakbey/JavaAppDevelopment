package org.sceylan.udemy.thread.executer.warehouse;

import java.util.concurrent.ThreadFactory;

public class ConsumerThreadFactory implements ThreadFactory {
    Runnable runnable;
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(runnable);
    }
}
