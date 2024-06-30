package org.example.udemy.thread.basicexample;

public class RunableThread implements Runnable{
    private int[] even = {2,4,6,8,10};
    @Override
    public void run() {
        for(var i : even)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
