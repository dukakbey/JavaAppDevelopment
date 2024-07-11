package org.sceylan.util.console;

import java.util.Scanner;

public class Console {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        while(true)
        {
            String str = kb.next();
            clearScreen();
            System.out.println("test");
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
