package org.sceylan.util.number.test;

import org.sceylan.util.array.ArrayUtil;
import org.sceylan.util.number.NumberUtil;

import java.util.Random;
import java.util.Scanner;

public class NumberUtilTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        long number;
        System.out.print("please enter number: ");
        number = kb.nextLong();

        long[] result= NumberUtil.getDigitsInThrees(number);
        if(result.length==0)
            System.out.println("Invalid Values!");
        else
            ArrayUtil.printArray(result);

    }
}
