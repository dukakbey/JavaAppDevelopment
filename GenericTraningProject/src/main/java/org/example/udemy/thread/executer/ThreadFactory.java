package org.example.udemy.thread.executer;

import org.example.udemy.thread.multipleThreads.ThreadColor;

import java.util.concurrent.ThreadFactory;

class ColorThreadFactory implements ThreadFactory {
    private String threadName;
    public ColorThreadFactory(ThreadColor color)
    {
        this.threadName = color.name();
    }
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName(threadName);
        return t;
    }
}
