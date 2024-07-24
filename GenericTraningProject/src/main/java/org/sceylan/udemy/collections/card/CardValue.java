package org.sceylan.udemy.collections.card;

public enum CardValue {
    TWO(0),THREE(1),FOUR(2),FIVE(3),
    SIX(4),SEVEN(5),EIGHT(6),NINE(7),TEN(8),
    J(9),Q(10),K(11),A(12);
    int num;
    CardValue(int num){this.num = num;}

    public int rank()
    {
        return num;
    }

}
