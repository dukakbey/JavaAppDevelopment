package org.sceylan.udemy.thread.multipleThreads;

public class CachedData {
    private volatile boolean flag = false;
    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isReady() {
        return flag;
    }
}