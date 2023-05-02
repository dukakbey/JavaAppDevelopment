package org.sceylan.util.test;

import org.sceylan.util.ArrayUtil;
import org.sceylan.util.NumberUtil;

import java.util.Random;
import java.util.Scanner;

public class NumberUtilTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        long number;
        System.out.print("please enter number: ");
        number = Integer.parseInt(kb.nextLine());

        long[] result= NumberUtil.getDigits(number);
        if(result.length==0)
            System.out.println("Invalid Values!");
        else
            ArrayUtil.print(result);

    }
}
