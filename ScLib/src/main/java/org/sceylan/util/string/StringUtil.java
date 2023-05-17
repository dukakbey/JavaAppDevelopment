package org.sceylan.util.string;

import org.sceylan.util.array.ArrayUtil;
import java.util.Random;

import javax.print.DocFlavor;

public class StringUtil {
    public static char firstNonRepeatingCharacter(String s)
    {
        int len = s.length();
        int [] a = new int[28];
        for(int i = 0;i<len;i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<len;i++)
        {
            if(a[s.charAt(i)-'a'] == 1)
                return s.charAt(i);
        }
        return ' ';
    }

    public static String reverse(String s)
    {
        char[] result = ArrayUtil.reverse(s.toCharArray());
        return String.valueOf(result);
    }
    public static String changeCase(String s)
    {
        char[] result = s.toCharArray();
        for(int i = 0;i<result.length;i++)
            result[i] = Character.isLowerCase(result[i]) ?
                    Character.toUpperCase(result[i]):Character.toLowerCase(result[i]);
        return String.valueOf(result);
    }

    public static String[] generateStringArray(Random r,int a)
    {
        String[] str= new String[a];
        //char[] tmp =new char[10];
        String tmp = new String();
        for(int i = 0;i<a;i++)
        {
            tmp = "";
            for(int j = 0;j<r.nextInt(0,10);j++)
            {
                tmp += (char)r.nextInt(65,122);
            }
            str[i] = String.valueOf(tmp);
        }
        return str;
    }

    public  static void getRandomText(Random r,int n,String text)
    {

    }
    public static void printStringArray(String[] s)
    {
        for(int i = 0;i<s.length;i++)
        {
            System.out.println(s[i].toString());
        }
        System.out.println("-------------------------");
    }
    public static String join(String[] s,String delimiter)
    {
        return join(s,delimiter,false);
    }
    public static String join(String[] s,String delimiter,boolean skipBlank)
    {
        String str = s[0];

        for(int i= 1;i<s.length;i++)
        {
            if(skipBlank && s[i].isBlank() )
                continue;
            str +=(delimiter +s[i]);
        }
        return str;
    }
    public static void printSplitResult(String str)
    {
        String[] words = str.split(":");
        System.out.println("---------------------------------");
        System.out.printf("Ad Soyad:%s\n",words[0]);
        System.out.printf("Ders:%s\n",words[1]);
        System.out.printf("Vize Tarih:%s\n",words[2]);
        System.out.printf("Final Tarih:%s\n",words[3]);
        System.out.printf("Arasinav Notu:%d\n",Integer.parseInt(words[4]));
        System.out.printf("Final Notu:%d\n",Integer.parseInt(words[5]));
    }
}
