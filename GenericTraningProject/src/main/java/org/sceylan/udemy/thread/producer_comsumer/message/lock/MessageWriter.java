package org.sceylan.udemy.thread.producer_comsumer.message.lock;

import java.util.Random;

public class MessageWriter implements Runnable{
    private MessageRepository m;
    private final Random r = new Random();

    public MessageWriter(MessageRepository m) {
        this.m = m;
    }

    private String message = """
            first line
            second line
            end..
            """;
    @Override
    public void run() {
        String[] lines = message.split("\n");
        for(var line:lines)
        {
            m.write(line);
            try {
                Thread.sleep(r.nextInt(500,2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        m.write("finished");

    }
}
