package org.sceylan.snakegame;

public class App {
    private static int size = 25;
    public static void run()
    {
        for (int i = 0; i <= size; i++) {

            for (int j = 0; j <= size; j++) {
                if(i == 0)
                {
                    System.out.printf("*");
                }
                else if(i == size)
                {
                    System.out.printf("*");
                }
                else if(j == 0)
                {
                    System.out.println("*");
                }
                else if(j == size)
                {
                    System.out.println("  *");
                }
                else {
                    System.out.printf(" ");
                }
            }
        }
    }

}
