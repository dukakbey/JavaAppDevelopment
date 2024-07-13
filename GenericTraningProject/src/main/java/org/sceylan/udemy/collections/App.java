package org.sceylan.udemy.collections;

import java.util.Arrays;

public class App {
    public static void run()
    {
        Card[] deck = new Card[13];
        Card card = Card.getCard(CardValue.J,Suit.CLUB);
        Arrays.fill(deck,card);
        Card.printDeck(Arrays.asList(deck),1);
    }
}
