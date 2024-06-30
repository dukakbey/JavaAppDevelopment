package org.sceylan.udemy.thread.producer_comsumer.message.lock;

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
                Thread.sleep(r.nextInt(500,2000));
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
