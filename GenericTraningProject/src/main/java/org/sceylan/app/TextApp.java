package org.sceylan.app;

import org.sceylan.util.string.TextGenerator;

public class TextApp {
    public static void run(int min,int bound)
    {
        System.out.println(TextGenerator.getRandomTextTR(min,bound));
    }
}
