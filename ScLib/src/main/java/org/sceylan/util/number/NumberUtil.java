package org.sceylan.util.number;

public class NumberUtil {

    public static String StringByDigits(int digits)
    {
        int cnt = 0;
        String str = "";

        switch(digits)
        {
            case 0:
                str ="zero";
                ++cnt;
                break;
            case 1:
                str ="one";
                ++cnt;
                break;
            case 2:
                str ="two";
                ++cnt;
                break;
            case 3:
                str ="three";
                ++cnt;
                break;
            case 4:
                str ="four";
                ++cnt;
                break;
            case 5:
                str ="five";
                ++cnt;

            case 6:
                str ="six";
                ++cnt;
                break;
            case 7:
                str ="seven";
                ++cnt;
                break;
            case 8:
                str ="eight";
                ++cnt;
                break;
            case 9:
                str ="nine";
                ++cnt;
                break;
        }
        System.out.println(cnt);
        assert cnt==1 :"possibly fal through";
        return str;
    }
    public static long[] getDigits(long number,int n)
    {
        int digitCount = (int)countDigit(number);
        digitCount = digitCount%n == 0 ? digitCount/n:digitCount/n+1;
        long digits[] = new long[digitCount];
        int powOfTen  = (int)Math.pow(10,n);
        for(int i  = digitCount-1;i>=0;digits[i--] = number%powOfTen,number /= powOfTen);
        return digits;
    }

    public static int[] getDigits(int number,int n)
    {
        int digitCount = countDigit(number);
        digitCount = digitCount%n == 0 ? digitCount/n:digitCount/n+1;
        int digits[] = new int[digitCount];
        int powOfTen  = (int)Math.pow(10,n);
        for(int i  = digitCount-1;i>=0;digits[i--] = number%powOfTen,number /= powOfTen);
        return digits;
    }
    public static int[] getDigitsInTwos(int num)
    {
        return getDigits(num,2);
    }
    public static long[] getDigitsInTwos(long num)
    {
        return getDigits(num,2);
    }
    public static int[] getDigitsInThrees(int num)
    {
        return getDigits(num,3);
    }
    public static long[] getDigitsInThrees(long num)
    {
        return getDigits(num,3);
    }
    public static int countDigit(int num)
    {
        return num == 0 ? 1:(int)Math.log10(Math.abs(num))+1;
    }
    public static long countDigit(long num)
    {
        return num == 0 ? 1:(long)Math.log10(Math.abs(num))+1;
    }
}
