package com.bridgelabz.objectorientedprograms;

import java.util.Random;

public class DeckOfCards {
	
	private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int DECK_SIZE = suits.length * ranks.length;

    public static void main(String[] args) {
        String[] deck = new String[DECK_SIZE];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }

        shuffle(deck);

        String[][] players = new String[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[i * 9 + j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i+1) + " cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    private static void shuffle(String[] deck) {
        Random rnd = new Random();
        for (int i = DECK_SIZE - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
}





