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
//
//    @Test
//    public void testOnePair() {
//        List<String> hand = Arrays.asList("2 of Hearts", "2 of Spades", "7 of Diamonds", "10 of Clubs", "King of Hearts");
//        assertEquals("One Pair", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testTwoPair() {
//        List<String> hand = Arrays.asList("2 of Hearts", "2 of Spades", "7 of Diamonds", "7 of Clubs", "King of Hearts");
//        assertEquals("Two Pair", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testThreeOfAKind() {
//        List<String> hand = Arrays.asList("2 of Hearts", "2 of Spades", "2 of Diamonds", "10 of Clubs", "King of Hearts");
//        assertEquals("Three of a Kind", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testStraight() {
//        List<String> hand = Arrays.asList("8 of Hearts", "9 of Spades", "10 of Diamonds", "Jack of Clubs", "Queen of Hearts");
//        assertEquals("Straight", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testFlush() {
//        List<String> hand = Arrays.asList("2 of Hearts", "5 of Hearts", "7 of Hearts", "10 of Hearts", "King of Hearts");
//        assertEquals("Flush", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testFullHouse() {
//        List<String> hand = Arrays.asList("2 of Hearts", "2 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts");
//        assertEquals("Full House", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testFourOfAKind() {
//        List<String> hand = Arrays.asList("2 of Hearts", "2 of Spades", "2 of Diamonds", "2 of Clubs", "King of Hearts");
//        assertEquals("Four of a Kind", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testStraightFlush() {
//        List<String> hand = Arrays.asList("8 of Hearts", "9 of Hearts", "10 of Hearts", "Jack of Hearts", "Queen of Hearts");
//        assertEquals("Straight Flush", PokerHandEvaluator.evaluateHand(hand));
//    }
//
//    @Test
//    public void testRoyalFlush() {
//        List<String> hand = Arrays.asList("10 of Hearts", "Jack of Hearts", "Queen of Hearts", "King of Hearts", "Ace of Hearts");
//        assertEquals("Royal Flush", PokerHandEvaluator.evaluateHand(hand));
//    }
}
