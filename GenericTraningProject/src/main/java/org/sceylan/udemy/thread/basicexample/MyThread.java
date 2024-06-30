package org.sceylan.udemy.thread.basicexample;

public class MyThread extends Thread{
    private int[] odd = {1,3,5,7,9};
    @Override
    public void run() {
        int a = -1;
        while(++a < odd.length)
        {
            System.out.println(odd[a]);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
