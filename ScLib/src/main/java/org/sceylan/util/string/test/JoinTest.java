package org.sceylan.util.string.test;
import org.sceylan.util.string.StringUtil;
import java.util.*;
public class JoinTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true)
        {
            System.out.println("please enter how many string you want to create: ");
            int n = kb.nextInt();
            System.out.println("please enter is Blank: ");
            String[] str = new String[3];
            str[0] = "dezgin";
            str[1] = "  ";
            str[2] = "sezo";
            boolean skipBlank = kb.nextBoolean();
            if (skipBlank)
                System.out.println(StringUtil.join(str,"_",true));
            else
                System.out.println(StringUtil.join(StringUtil.generateStringArray(r,n),"__"));
        }


    }
}