package org.sceylan.udemy.thread.producer_comsumer.message.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MessageRepository {
    private String message = "";
    private boolean hasMessage = false;

    private final Lock lock = new ReentrantLock();

    public String read()
    {
        if(lock.tryLock())
        {
            try
            {
                while(!hasMessage)
                {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                hasMessage =false;
            }
            finally {
                lock.unlock();
            }
        }
        else
        {
            System.out.println("**reader blocked.");
            hasMessage = false;
        }
        return message;
    }
    public void write(String t)
    {
        try {
            if(lock.tryLock(3,TimeUnit.SECONDS))
            {
                try
                {
                    while(hasMessage)
                    {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                finally {
                    lock.unlock();
                }
                hasMessage = true;

            }
            else {
                System.out.println("**writer blocked..");
                hasMessage = true;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        message = t;
    }
}
