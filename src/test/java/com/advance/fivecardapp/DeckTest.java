package com.advance.fivecardapp;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    public void testDeckCreation() {
        Deck deck = new Deck();
        assertEquals(52, deck.size());
    }

    @Test
    public void testDeckShuffling() {
        Deck deck = new Deck();
        List<Card> originalOrder = new ArrayList<>(deck.getCards());

        // Shuffle the deck
        deck.shuffle();

        // The order should be different after shuffling
        assertNotEquals(originalOrder, deck.getCards());
    }

    @Test
    public void testDealCard() {
        Deck deck = new Deck();
        int initialSize = deck.size();

        // Deal a card
        List<Card> dealtCard = deck.dealHand(5);

        // The size of the deck should decrease by 1 after dealing a card
        assertEquals(initialSize, deck.size()+ 5);
        // Ensure that the dealt card is a valid card from the deck (you can customize this validation)
        assertNotNull(dealtCard);
    }

}
