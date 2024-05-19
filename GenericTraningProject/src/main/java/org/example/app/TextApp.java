package org.example.app;

import org.example.util.string.TextGenerator;

public class TextApp {
    public static void run(int min,int bound)
    {
        System.out.println(TextGenerator.getRandomTextTR(min,bound));
    }
}
