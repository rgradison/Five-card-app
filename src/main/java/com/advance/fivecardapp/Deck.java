package com.advance.fivecardapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    /**
     * Constructor for the Deck class.
     * Initializes a new deck with 52 standard playing cards.
     */
    public Deck() {
        initializeDeck();
    }

    /**
     * Initializes the deck with 52 standard playing cards.
     */
    public void initializeDeck() {
        cards = new ArrayList<>();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    //@return A list representing the dealt hand.

    public List<Card> dealHand(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }

    //@return The number of cards remaining in the deck.

    public int size() {
        return cards.size();
    }

    //@return The list of cards in the deck.

    public List<Card> getCards() {
        return cards;
    }

}

