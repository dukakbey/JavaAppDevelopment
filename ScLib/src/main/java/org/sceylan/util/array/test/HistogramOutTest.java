package org.sceylan.util.array.test;
import org.sceylan.util.array.ArrayUtil;
import java.util.Scanner;
import java.util.Random;
public class HistogramOutTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("please enter max value array can hold: ");
        int max = kb.nextInt();
        int[] arr = new int[10];
        for(int i =0;i<10;i++)
        {
            arr[i] = r.nextInt(1,max);
        }
        System.out.println("list of array: ");
        ArrayUtil.printArray(arr);
        System.out.println("-------------------------- ");
        System.out.println("histogram of array: ");
        int [] tmp = ArrayUtil.getHistogramData(arr,max);
        ArrayUtil.printArray(tmp);
    }
}
