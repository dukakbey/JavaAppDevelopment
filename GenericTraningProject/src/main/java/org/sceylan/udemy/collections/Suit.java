package org.sceylan.udemy.collections;

public enum Suit {
    CLUB('♣'),DIAMOND('♦'),HEART('♥'),SPADE('♠');
    Suit(char str){this.str = str;}
    private char str;
    char symbol()
    {
        return str;
    }
}
