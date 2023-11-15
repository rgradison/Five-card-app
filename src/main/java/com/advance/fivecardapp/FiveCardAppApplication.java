package com.advance.fivecardapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FiveCardAppApplication {

    private static int NumCards = 5;

    public static void main(String[] args) {

        
        SpringApplication.run(FiveCardAppApplication.class, args);
        // Instantiate and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // Deal a hand to the player
        List<Card> hand = deck.dealHand(NumCards);

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
    }

}
