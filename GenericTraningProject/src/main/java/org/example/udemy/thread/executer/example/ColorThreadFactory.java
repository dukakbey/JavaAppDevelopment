package org.example.udemy.thread.executer.example;

import java.util.concurrent.ThreadFactory;

public class ColorThreadFactory implements ThreadFactory {
    private String threadName;
    private int colorValue = 1;
    ColorThreadFactory(EnumColor color)
    {
        threadName = color.name();
    }

    public ColorThreadFactory(int colorValue) {
        this.colorValue = colorValue;
    }

    public ColorThreadFactory() {
    }

    @Override
    public Thread newThread(Runnable r) {
        var name = threadName;
        if(name == null)
        {
            name = EnumColor.values()[colorValue].name();
        }
        if(++colorValue>EnumColor.values().length)
        {
            colorValue = 1;
        }
        return new Thread(r,name);
    }
}
