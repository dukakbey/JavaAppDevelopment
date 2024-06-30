package org.sceylan.udemy.thread.synchronization;

public class App {
    public static void run()
    {
        BankAccount b = new BankAccount(10000);

        Thread t1 = new Thread(()->b.withdraw(2500));
        Thread t2 = new Thread(()-> b.deposit(5000));
        Thread t3 = new Thread(()->b.withdraw(2500));

        t1.start();
        t2.start();
        t3.start();

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.printf("FINAL BALANCE: %.0f",b.getBalance());
    }

}
