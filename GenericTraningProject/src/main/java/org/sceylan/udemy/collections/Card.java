package org.sceylan.udemy.collections;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private Suit suit;
    private String face;
    private CardValue cardValue;
    Card(CardValue cardValue,Suit suit)
    {
        if(cardValue != CardValue.A && cardValue != CardValue.K &&
                cardValue != CardValue.Q && cardValue != CardValue.J)
            face = String.valueOf(cardValue.ordinal()+2) + suit.symbol() +"("+cardValue.rank()+")";

        else
            face = cardValue.toString() + suit.symbol() +"("+cardValue.rank()+")";
        this.suit = suit;
        this.cardValue = cardValue;
    }

    @Override //2♣(0)
    public String toString()
    {
        return face;
    }
    static Card getCard(CardValue c,Suit s)
    {
        return new Card(c,s);
    }
    static List<Card> getStandardDeck()
    {
        List<Card> cards = new ArrayList<>();
        for(var s:Suit.values())
        {
            for(var c:CardValue.values())
            {
                cards.add(new Card(c,s));
            }
        }
        return cards;
    }
//    public static void printDeck()
//    {
//        List<Card> cards = getStandardDeck();
//        for(var c:cards)
//        {
//            if(c.cardValue.rank() == 12)
//            {
//                System.out.println(c+" ");
//            }
//            else
//                System.out.print(c+" ");
//        }
//
//    }
    public static void printDeck(List<Card> deck,String description, int rows) {
        System.out.println("---------------------------");
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
    public static void printDeck()
    {
        printDeck(getStandardDeck(),"Standart Deck",4);
    }
    public static void printDeck(int rows) {
        printDeck(getStandardDeck(),"Standart Deck",rows);
    }
    public static void printDeck(List<Card> deck)
    {
        printDeck(deck,"Deck",4);
    }
    public static void printDeck(List<Card> deck,int rows)
    {
        printDeck(deck,"Deck",rows);
    }
}
