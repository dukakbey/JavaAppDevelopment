package org.sceylan.myapps;

public class ConcatCommandPromtArgument
{
    public static void run(String [] args)
    {
        StringBuilder sb = new StringBuilder(50);

        for(String i:args)
        {
            sb.append(i);
            sb.append(";");
            System.out.println(sb.toString());
        }
    }
}
