package org.sceylan.util.test;

import java.util.Random;
import java.util.Scanner;
import org.sceylan.util.ArrayUtil;
public class ArrayUtilTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        int max,min,size;
        System.out.print("please enter max,min,size: ");
        max = Integer.parseInt(kb.nextLine());
        min = Integer.parseInt(kb.nextLine());
        size = Integer.parseInt(kb.nextLine());
        int[] result= ArrayUtil.getRandomIntArray(r,max,min,size);
        if(result.length==0)
            System.out.println("Invalid Values!");
        else
            ArrayUtil.print(result);

    }
}
