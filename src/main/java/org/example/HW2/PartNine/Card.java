package org.example.HW2.PartNine;

enum type{
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

enum suit{
    HEART, SPADES, DIAMONDS, CLUBS
}

public class Card {
    private String suit, type;
    public Card(type t, suit s){
        this.suit = s.name();
        this.type = t.name();
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
