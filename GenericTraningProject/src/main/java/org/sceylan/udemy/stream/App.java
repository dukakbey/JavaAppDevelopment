package org.sceylan.udemy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void run()
    {
        Random r = new Random();
        List<Integer> numbers  = Arrays.asList(1,2,3,4,44,89);

        //numbers.stream().filter(p->p>3).map(p->p*2).forEach(System.out::println);

        String[] s = {"sezgin","demet","zeynep"};
        //Arrays.stream(s).map(p-> p.charAt(0)+"-"+p).forEach(System.out::println);

        //Stream.generate(()-> r.nextInt(100)).limit(5).forEach(System.out::println);
        IntStream.iterate(1,i->i+2)
                .limit(20)
                .forEach(System.out::println);
    }
}
