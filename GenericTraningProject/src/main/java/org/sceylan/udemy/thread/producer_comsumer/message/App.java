package org.sceylan.udemy.thread.producer_comsumer.message;

public class App {

    public static void run()
    {
        MessageRepository m = new MessageRepository();

        MessageWriter p = new MessageWriter(m);
        MessageReader c = new MessageReader(m);

        Thread write = new Thread(p);
        Thread read = new Thread(c);


        write.start();
        read.start();
    }
}
