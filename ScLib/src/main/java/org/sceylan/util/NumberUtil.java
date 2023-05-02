package org.sceylan.util;

public class NumberUtil {

    public static long[] getDigits(long number)
    {
        long birler = number%10;
        long onlar = number/10%10;
        long yuzler = number/100;
        long[] digits = new long[3];
        digits[2] = birler;
        digits[1] = onlar;
        digits[0] = yuzler;
        return digits;
    }


}
