package org.example.app;

import java.util.Random;
import java.util.stream.IntStream;

public class LambdaApp {
    public static void run()
    {
        Random r = new Random();
        LambdaExample c = (a,b)-> a+b;
        IntStream.generate(()->r.nextInt(100))
                .limit(10)
                .forEach(System.out::println);
    }

}
