package org.example.udemy.thread.multipleThreads;
import java.util.concurrent.TimeUnit;

public class CachedData {
    private volatile boolean flag = false;
    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isReady() {
        return flag;
    }
}