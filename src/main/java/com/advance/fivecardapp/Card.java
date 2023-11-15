package com.advance.fivecardapp;

public class Card {
    private String suit;
    private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
