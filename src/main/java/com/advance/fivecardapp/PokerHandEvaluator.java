package com.advance.fivecardapp;

import java.util.*;
import java.util.stream.Collectors;

public class PokerHandEvaluator {

    public String evaluateHand(List<Card> hand) {
        System.out.println("Hand baba :" + hand);

        if (isStraightFlush(hand)) {
            return "Straight Flush";
        } else if (isFourOfAKind(hand)) {
            return "Four of a Kind";
        } else if (isFullHouse(hand)) {
            return "Full House";
        } else if (isFlush(hand)) {
            return "Flush";
        }else if (isRoyalFlush(hand)) {
            return "Royal Flush";
        } else if (isStraight(hand)) {
            return "Straight";
        } else if (isThreeOfAKind(hand)) {
            return "Three of a Kind";
        } else if (isTwoPair(hand)) {
            return "Two Pair";
        } else if (isOnePair(hand)) {
            return "One Pair";
        } else {
                return "High Cards";
        }
    }

    private boolean isStraightFlush(List<Card> hand) {
        List<String> expectedRanks = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

        List<Card> sortedHand = hand.stream()
                .sorted(Comparator.comparingInt(this::getRankValue))
                .collect(Collectors.toList());

        // Check if the ranks form a sequence
        for (int i = 0; i < sortedHand.size() - 1; i++) {
            if (getRankValue(sortedHand.get(i + 1)) - getRankValue(sortedHand.get(i)) != 1) {
                return false;
            }
        }
       // Check if all cards have the same suit
        String firstSuit = sortedHand.get(0).getSuit();
        return sortedHand.stream().allMatch(card -> card.getSuit().equals(firstSuit));
    }

    private boolean isFourOfAKind(List<Card> hand) {
        Map<String, Long> rankCounts = hand.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        return rankCounts.containsValue(4L);
    }

    private boolean isFullHouse(List<Card> hand) {
        Map<String, Long> rankCounts = hand.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        return rankCounts.containsValue(3L) && rankCounts.containsValue(2L);
    }

    private boolean isFlush(List<Card> hand) {
        Set<String> distinctSuits = hand.stream()
                .map(Card::getSuit)
                .collect(Collectors.toSet());

        return distinctSuits.size() == 1;
    }

    private boolean isStraight(List<Card> hand) {
        List<Card> sortedHand = hand.stream()
                .sorted(Comparator.comparingInt(this::getRankValue))
                .collect(Collectors.toList());

        for (int i = 0; i < sortedHand.size() - 1; i++) {
            if (getRankValue(sortedHand.get(i + 1)) - getRankValue(sortedHand.get(i)) != 1) {
                return false;
            }
        }

        return true;
    }

    private boolean isThreeOfAKind(List<Card> hand) {
        Map<String, Long> rankCounts = hand.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        return rankCounts.containsValue(3L);
    }

    private boolean isTwoPair(List<Card> hand) {
        Map<String, Long> rankCounts = hand.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        long pairCount = rankCounts.values().stream().filter(count -> count == 2).count();

        return pairCount == 2;
    }

    private boolean isOnePair(List<Card> hand) {
        Map<String, Long> rankCounts = hand.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        return rankCounts.containsValue(2L);
    }
    //Same as Royal Flush
    private boolean isRoyalFlush(List<Card> hand) {
        // Assuming the hand is already a StraightFlush
        return hand.stream().allMatch(card -> "10JQKA".contains(card.getRank()));
    }




    private int getRankValue(Card card) {

        Map<String, Integer> rankValues = new HashMap<>();
        rankValues.put("2", 2);
        rankValues.put("3", 3);
        rankValues.put("4", 4);
        rankValues.put("5", 5);
        rankValues.put("6", 6);
        rankValues.put("7", 7);
        rankValues.put("8", 8);
        rankValues.put("9", 9);
        rankValues.put("10", 10);
        rankValues.put("Jack", 11);
        rankValues.put("Queen", 12);
        rankValues.put("King", 13);
        rankValues.put("Ace", 14);


        return rankValues.get(card.getRank());
    }
}

