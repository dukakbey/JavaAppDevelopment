package org.example.util.string;

import java.util.Random;

public class TextGenerator {
    private static final String ALPHABET_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
    private static final String ALPHABET_EN = "abcdefghijklmnopqrstuwxvyz";
    private static final String ALPHABET_CAPITALS_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    private static final String ALPHABET_CAPITALS_EN = "ABCDEFGHIJKLMNOPQRSTUWXVYZ";

    private final static Random rand = new Random();
    private static String text ;
    public static String getRandomTextTR(int min,int bound)
    {
        text = "";
        bound = rand.nextInt(min,bound);
        for (int i = 0; i < bound; i++) {
            text += ALPHABET_TR.charAt(rand.nextInt(0,27));
        }
        return text;
    }
    public static String getRandomTextTR_Upper(int min,int bound)
    {
        text = "";
        bound = rand.nextInt(min,bound);
        for (int i = 0; i < bound; i++) {
            text += ALPHABET_CAPITALS_TR.charAt(rand.nextInt(0,27));
        }
        return text;
    }




}
