package com.advance.fivecardapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PlayPocker {

    @Autowired
    private AppConfig appConfig;
    public String play(){

        Deck deck = new Deck();
        deck.shuffle();

        // Deal a hand to the player
        List<Card> hand = deck.dealHand(appConfig.getNumCards());

        // Display the hand to the player
        System.out.print("Your hand: ");
        for (Card card : hand) {
            System.out.print(card.getRank() + card.getSuit() + " ");
        }
        System.out.println();

        // Evaluate and display the poker hand
        PokerHandEvaluator evaluator = new PokerHandEvaluator();
        String result = evaluator.evaluateHand(hand);
        System.out.println("You have: " + result);
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Your Cards", hand.toString());
        myMap.put("Result", result);
        return myMap.toString();
    }
}
