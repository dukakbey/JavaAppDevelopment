package org.example.app;

import org.example.util.string.TextGenerator;

import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalApp
{
    public static void run()
    {
        while(true)
        {
            IntStream intStream;

            Optional<String> opt;
            opt = Optional.of(TextGenerator.getRandomTextTR_Upper(5,5));
            opt.filter(p->p.startsWith("b")).map(String::length).ifPresentOrElse(System.out.println;,()->System.out.println("ss")));
        }


    }
}
