package org.sceylan.udemy.collections;

import java.util.ArrayList;
import java.util.List;

public class Card {
    public Suit suit;
    private String face;
    public CardValue cardValue;

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
    public String getSuit()
    {
        return suit.symbol();
    }
    public int rank()
    {
        return cardValue.rank();
    }
    public String value()
    {
        return cardValue.toString();
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {

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
    public static void printRanks(List<Card> cards)
    {
        int i = 0;
        for (var card: cards) {
            System.out.printf("card_%d suit: %s face:%s rank:%d \n",i++,card.suit.toString(),card.face.toString(),card.rank());
        }

    }
//    public static void printDeck()
//    {
//        printDeck(getStandardDeck(),"Standart Deck",4);
//    }
//    public static void printDeck(int rows) {
//        printDeck(getStandardDeck(),"Standart Deck",rows);
//    }
//    public static void printDeck(List<Card> deck)
//    {
//        printDeck(deck,"Deck",4);
//    }
//    public static void printDeck(List<Card> deck,int rows)
//    {
//        printDeck(deck,"Deck",rows);
//    }

}
