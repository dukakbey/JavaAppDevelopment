package org.example.thread.synchronization;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            throw new RuntimeException(ex);
        }
        double origBalance = balance;
        balance += amount;
        System.out.printf("STARTING BALANCE: %.0f, DEPOSIT: %.0f" + ": NEW BALANCE = %.0f%n",origBalance,amount,balance);
    }
    public void withdraw(double amount)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            throw new RuntimeException(ex);
        }
        double origBalance = balance;
        if(amount<=balance)
        {
            balance -= amount;
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAWAL: %.0f" + ": " +
                    "NEW BALANCE = %.0f%n",origBalance,amount,balance);
        }
        else {
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAWAL: %.0f" + ": " +
                    ": INSUFFICIENT FUNDS%n",origBalance,amount);
        }
    }


}
