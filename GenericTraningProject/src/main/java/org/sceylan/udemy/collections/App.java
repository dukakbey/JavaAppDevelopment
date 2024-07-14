package org.sceylan.udemy.collections;

import java.util.*;

public class App {
    public static void run()
    {
        List<Card> deck = Card.getStandardDeck();

        Collections.shuffle(deck);
        Card.printDeck(deck);

        var comparator = Comparator.comparing(Card::rank).thenComparing(Card::value);
        Collections.sort(deck,comparator);
        System.out.println(deck.get(0).value());
        Card.printDeck(deck);

    }
}
