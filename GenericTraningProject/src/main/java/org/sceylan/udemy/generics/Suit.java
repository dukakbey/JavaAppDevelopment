package org.sceylan.udemy.generics;

public enum Suit {
    CLUB('♣'),DIAMOND('♦'),HEART('♥'),SPADE('♠');
    Suit(char str){this.str = str;}
    private char str;
    char symbol()
    {
        return str;
    }

}
