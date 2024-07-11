package org.sceylan.projects.snakegame;

import org.sceylan.util.console.Console;

public class App {
    private static int size = 25;
    public static void run()
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
                Console.clearScreen();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            draw();

        }
    }


    public static void draw() {
        for (int i = 0; i <= size; i++) {

            for (int j = 0; j <= size; j++) {
                if(i == 0) {
                    System.out.print("*");
                }
                else if(i == size) {
                    System.out.print("*");
                }
                else if(j == 0) {
                    System.out.print("*");
                }
                else if(j == size) {
                    System.out.println("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
