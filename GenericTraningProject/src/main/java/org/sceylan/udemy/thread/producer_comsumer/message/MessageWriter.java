package org.sceylan.udemy.thread.producer_comsumer.message;

import java.util.Random;

public class MessageWriter implements Runnable{
    private MessageRepository m;
    private final Random r = new Random();

    public MessageWriter(MessageRepository m) {
        this.m = m;
    }

    private String message = """
            this is first line
            second line
            end..
            """;
    @Override
    public void run() {
        try {
            Thread.sleep(r.nextInt(500),r.nextInt(1500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] lines = message.split("\n");
        for(var line:lines)
            m.write(line);
        m.write("finished");
    }
}