package org.sceylan.util.number.test;

import org.sceylan.util.number.NumberUtil;
import org.sceylan.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class GetDigitsTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        while (true) {
            System.out.print("please enter number:");
            long number = kb.nextLong();
            long[] numberDigits;
            numberDigits = NumberUtil.getDigitsInTwos(number);
            if (number == -1)
                return;
            ArrayUtil.printArray(numberDigits);
        }

    }
}
