package org.sceylan.util.string.test;
import org.sceylan.util.string.StringUtil;
import java.util.*;
public class GenerateStringArray {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true)
        {
            System.out.println("please enter how many string you want to create: ");
            int n = kb.nextInt();
            if (n == -1)
                return;
            StringUtil.printStringArray(StringUtil.generateStringArray(r,n));
        }


    }
}
