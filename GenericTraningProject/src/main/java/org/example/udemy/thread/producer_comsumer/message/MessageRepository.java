package org.example.udemy.thread.producer_comsumer.message;

public class MessageRepository {
    private String message = "";
    private boolean hasMessage = false;

    public synchronized String read()
    {
        while(!hasMessage)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasMessage =false;
        notifyAll();
        return message;
    }

    public synchronized void write(String t)
    {
        while(hasMessage)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasMessage = true;
        message = t;
        notifyAll();
    }

}
