package org.sceylan.udemy.collections.card;

import java.util.*;

public class App {
    public static void run()
    {
        List<Card> deck = Card.getStandardDeck();

        Collections.shuffle(deck);
        Card.printDeck(deck,"deck",1);

//        var comparator = Comparator.comparing(Card::rank).thenComparing(Card::getSuit);
//        deck.sort(comparator);
        //System.out.println(deck.get(0).suit);
        //Card.printDeck(deck,"sc",1);

        List<Card> subDeck = new ArrayList<>(deck.subList(4,8));


        boolean res = new HashSet<>(deck).containsAll(subDeck);
        System.out.println(res ? "alt küme içeriyor":"alt küme içermiyor");
        boolean isDis =  deck.removeAll(subDeck);
        res = new HashSet<>(deck).containsAll(subDeck);
        System.out.println(res ? "alt küme içeriyor":"alt küme içermiyor");
        System.out.println(isDis ? "deleted":"can not deleted");




    }
}
