package org.sceylan.udemy.collections;

import java.util.*;

public class App {
    public static void run()
    {
//        List<Card> deck = Card.getStandardDeck();
//
//        //Collections.shuffle(deck);
////        Card.printDeck(deck);
//
//        var comparator = Comparator.comparing(Card::rank);
//        deck.sort(comparator);
//        //Card.printDeck(deck,"sc",13);
//        Card.printRanks(deck);

        List <Card> cards = new ArrayList<>();
        for(var s:Suit.values())
        {
            for(var c:CardValue.values())
            {
                System.out.println(s.toString() +"__" +c.toString());;
            }
        }
//        Card.printRanks(cards);

    }
}
