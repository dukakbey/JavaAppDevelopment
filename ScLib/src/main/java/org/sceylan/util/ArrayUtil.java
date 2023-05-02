package org.sceylan.util;
import java.util.Random;
public class ArrayUtil {
    public static int[] getRandomIntArray(Random r,int max,int min,int size)
    {
        System.out.print("in\n");
        if(size<=0 || min==max)
            return new int[0];
        else
        {
            int [] a = new int[size];

            for(int i = 0;i<size;++i)
            {
                a[i] = r.nextInt(min,max);
            }
            return a;
        }

    }

    public static void print(int[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.printf("number%d: %d\n",i,a[i]);
        }
    }
    public static void print(long[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.printf("number%d: %d\n",i,a[i]);
        }
    }
}
