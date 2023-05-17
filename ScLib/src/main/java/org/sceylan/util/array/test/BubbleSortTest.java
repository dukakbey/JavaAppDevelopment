package org.sceylan.util.array.test;
import org.sceylan.util.array.ArrayUtil;
import java.util.Random;
import java.util.Scanner;


public class BubbleSortTest {
    public static void run()
    {
        int arrayLength,max,min;
        int stop;
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("please enter length of array: ");
        arrayLength = kb.nextInt();
        System.out.print("\nplease enter min value of array: ");
        min = kb.nextInt();
        System.out.print("\nplease enter max value of array: ");
        max = kb.nextInt();
        while(true)
        {
            int [] a = ArrayUtil.getRandomIntArray(r,max,min,arrayLength);
            ArrayUtil.printArray(a);
            boolean desc = r.nextBoolean();
            ArrayUtil.bubleSort(a,desc);
            System.out.printf("%s sorted array:%n",desc ?"descending":"ascending");
            ArrayUtil.printArray(a);
            System.out.printf("do you want to stop algorithm 1/0 ?: ");
            kb.nextInt();
        }
    }
}
