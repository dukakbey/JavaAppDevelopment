package org.sceylan.util.array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayUtil {
    public static char firstNonRepeatingCharacter(String s)
    {
        int [] arr = fillASCII(s);

        for(int i = 0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a'] == 1)
                return s.charAt(i);
        }
        return '_';
    }
    public static int[] getHistogramData(int[] arr,int n)
    {
        int [] histogramOut = new int[n];
        for(int i = 0;i<arr.length;i++)
        {
           ++histogramOut[arr[i]];
        }
        return histogramOut;
    }
    static int[] fillASCII(String s)
    {
        int [] arr = new int[26];
        for(int i = 0;i<s.length();i++)
            ++arr[s.charAt(i)-'a'];
        return arr;
    }
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
    public static void selectionSort(int [] arr)
    {
        int min;
        int minIndex;
        for(int i = 0;i<arr.length;i++)
        {
            min = arr[i];
            minIndex = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(min>arr[j])
                {
                    minIndex = j;
                    min = arr[j];
                }
            }
            swap(arr,i,minIndex);
        }

    }
    public static void bubleSort(int [] a)
    {
        bubleSort(a,false);
    }
    public static void bubleSort(int [] a,boolean descending)
    {
        if(descending)
            bubleSortDescending(a);
        else
            bubleSortAscending(a);
    }
    static void bubleSortDescending(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                    swap(arr,i,j);
            }
        }

    }
    static void bubleSortAscending(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
        }
    }
    static int[] swap(int[] arr,int firstNumber,int secondNumber)
    {
        int tmp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = tmp;
        return arr;
    }
    static char[] swap(char[] arr,int firstNumber,int secondNumber)
    {
        char tmp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = tmp;
        return arr;
    }
    public static char[] reverse(char[] arr)
    {
        for(int i =0, j= arr.length-1;i<arr.length/2;i++,j--)
            swap(arr,i,j);
        return arr;
    }
    public static int[] getHistogram(int [] arr,int n)
    {
        int cnt[] = new int[n+1];
        for(int i = 0;i<arr.length;++i)
        {
            ++cnt[arr[i]];
        }
        return cnt;
    }
    public static void printArray(int[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.printf("number%d: %d\n",i,a[i]);
        }
    }
    public static void printArray(long[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.printf("number%d: %d\n",i,a[i]);
        }
    }
}
