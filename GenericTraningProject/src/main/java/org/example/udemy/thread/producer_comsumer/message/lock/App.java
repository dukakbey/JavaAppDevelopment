package org.example.udemy.thread.producer_comsumer.message.lock;

public class App {

    public static void run()
    {
        MessageRepository m = new MessageRepository();

        MessageWriter p = new MessageWriter(m);
        MessageReader c = new MessageReader(m);

        Thread write = new Thread(p);
        Thread read = new Thread(c);
        write.setUncaughtExceptionHandler((thread,exc)->{
            System.out.println("writeThread throws an exception:" +exc);
            if(read.isAlive())
            {
                read.interrupt();
                System.out.println("going to interrupt reader");
            }
        });
        read.setUncaughtExceptionHandler((thread,exc)->{
            System.out.println("readThread throws an exception:" +exc);
            if(write.isAlive())
            {
                write.interrupt();
                System.out.println("going to interrupt writer");
            }
        });

        write.start();
        read.start();
    }
}
