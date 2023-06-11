package org.sceylan;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
import org.sceylan.myapps.ConcatCommandPromtArgument;
import org.sceylan.util.recursive.RecursiveUtil;
import org.sceylan.util.recursive.RecursiveUtil.*;

public class App {
    public static void sc(int ...values)
    {
        for(var i:values)
            System.out.println(i);
    }
    public static void run(String[] args)
    {
        System.out.println(RecursiveUtil.findFactorial(5));
        //ConcatCommandPromtArgument.run(args);

    }
}
