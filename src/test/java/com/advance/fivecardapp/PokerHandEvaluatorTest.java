package com.advance.fivecardapp;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandEvaluatorTest {

    @Test
    public void testHighCard() {
        List<Card> hand = Arrays.asList( new Card("Hearts","2"), new  Card("Spades","5"),new Card("Diamonds","7") ,new Card( "Clubs","10"),new Card( "Hearts","King"));
        assertEquals("High Cards", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testOnePair() {
        List<Card> hand = Arrays.asList(new Card("Hearts","2"), new  Card("Spades","8"), new Card("Diamonds","7"), new Card( "Clubs","8"), new Card( "Hearts","Ace"));
        assertEquals("One Pair", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testTwoPair() {
        List<Card> hand = Arrays.asList(new Card("Hearts","2"), new  Card("Spades","8"), new Card("Diamonds","2"), new Card( "Clubs","8"),  new Card( "Hearts","Ace"));
        assertEquals("Two Pair", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testThreeOfAKind() {
        List<Card> hand = Arrays.asList(new Card("Hearts","2"), new  Card("Spades","5"), new Card("Diamonds","2"), new Card( "Clubs","2"), new Card( "Hearts","King"));
        assertEquals("Three of a Kind", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testStraight() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","8"), new  Card("Spades","9"), new Card("Diamonds","10"), new Card( "Clubs","Jack"), new Card( "Hearts","Queen"));
        assertEquals("Straight", new PokerHandEvaluator().evaluateHand(hand));
    }

   @Test
    public void testFlush() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","2"), new Card( "Hearts","5"), new Card( "Hearts","7"), new Card( "Hearts","10"), new Card( "Hearts","King"));
        assertEquals("Flush", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testFullHouse() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","2"), new  Card("Spades","King"), new Card("Diamonds","2"), new Card( "Clubs","2"),  new Card( "Hearts","King"));
        assertEquals("Full House", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testFourOfAKind() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","2"),new  Card("Spades","2"),new Card("Diamonds","2"), new Card( "Clubs","2"), new Card( "Hearts","King"));
        assertEquals("Four of a Kind", new PokerHandEvaluator().evaluateHand(hand));
    }

    @Test
    public void testStraightFlush() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","8"), new Card( "Hearts","9"), new Card( "Hearts","10"),new Card( "Hearts","Jack"), new Card( "Hearts","Queen"));
        assertEquals("Straight Flush", new PokerHandEvaluator().evaluateHand(hand));
    }
    //Royal flush and Straight flush implement the same logic
   @Test
    public void testRoyalFlush() {
        List<Card> hand = Arrays.asList(new Card( "Hearts","10"), new Card( "Hearts","Jack"), new Card( "Hearts","Queen"), new Card( "Hearts","King"), new Card( "Hearts","Ace"));
        assertEquals("Straight Flush", new PokerHandEvaluator().evaluateHand(hand));
    }

}
