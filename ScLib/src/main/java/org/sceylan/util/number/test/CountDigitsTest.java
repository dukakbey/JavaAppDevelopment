package org.sceylan.util.number.test;
import java.util.Random;
import java.util.Scanner;
import org.sceylan.util.number.NumberUtil;
public class CountDigitsTest
{
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        while(true)
        {
            System.out.print("please enter number:");
            long number = kb.nextLong();
            if(number == -1)
                return;
            System.out.printf("digits count of number: %d\n",NumberUtil.countDigit(number));

        }

    }

}
