package org.sceylan.util.array.test;

import org.sceylan.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class FirstNonRepeatingCharacterTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        String tmp;
        while(true)
        {
            System.out.print("\nplease enter string: ");
            tmp = kb.nextLine();
            char c = ArrayUtil.firstNonRepeatingCharacter(tmp);
            System.out.printf("first non repeating char: %c\n",c);
            System.out.println("enter d for exiting");
            if(c == 'd')
                return;;
        }
    }
}
