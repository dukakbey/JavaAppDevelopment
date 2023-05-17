package org.sceylan.util.date.test;
import org.sceylan.util.date.DateUtil;

import java.util.Scanner;
import java.util.Random;
public class GetDaysTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
       while(true)
        {
            System.out.printf("day: %s", DateUtil.getDay(21,04,2023));
            kb.nextLine();
        }
    }
}
