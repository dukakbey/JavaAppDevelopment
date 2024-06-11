package org.example.udemy.thread.producer_comsumer.message;

import java.util.Random;

public class MessageReader implements Runnable{
    private MessageRepository m;
    private String line;
    private final Random r = new Random();
    public MessageReader(MessageRepository m) {
        this.m = m;
    }
    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(r.nextInt(1000),r.nextInt(2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            line = m.read();
            System.out.println(line);
            if(line.equals("finished"))
                return;
        }
    }
}
