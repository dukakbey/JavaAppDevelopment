package org.sceylan.util.recursive;

public class RecursiveUtil
{
    public static long findFactorial(long num)
    {
        if(num == 0)
            return 1;
        return num*findFactorial(num-1);
    }

}
