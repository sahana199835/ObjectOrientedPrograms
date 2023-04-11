package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
	
protected static final Object ranks = null;
protected static final Object ranks = null;
protected static Object ranks;

//	private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
//    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//    private static final int DECK_SIZE = suits.length * ranks.length;
//
//    public static void main(String[] args) {
//        String[] deck = new String[DECK_SIZE];
//        for (int i = 0; i < ranks.length; i++) {
//            for (int j = 0; j < suits.length; j++) {
//                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
//            }
//        }
//
//        shuffle(deck);
//
//        String[][] players = new String[4][9];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 9; j++) {
//                players[i][j] = deck[i * 9 + j];
//            }
//        }
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Player " + (i+1) + " cards:");
//            for (int j = 0; j < 9; j++) {
//                System.out.println(players[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void shuffle(String[] deck) {
//        Random rnd = new Random();
//        for (int i = DECK_SIZE - 1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            String temp = deck[index];
//            deck[index] = deck[i];
//            deck[i] = temp;
//        }
//    }
//}
//
//
//private static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
//static final String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
//private static final int DECK_SIZE = suits.length * ranks.length;
//
//public static void main(String[] args) {
//	String[] deck = new String[DECK_SIZE];
//	for (int i = 0; i < ranks.length; i++) {
//		for (int j = 0; j < suits.length; j++) {
//			deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
//		}
//	}
//
//	shuffle(deck);
//
//	Queue<Player> playersQueue = new LinkedList<>();
//	playersQueue.add(new Player("Player 1"));
//	playersQueue.add(new Player("Player 2"));
//	playersQueue.add(new Player("Player 3"));
//	playersQueue.add(new Player("Player 4"));
//
//	for (int i = 0; i < DECK_SIZE; i++) {
//		Player currentPlayer = playersQueue.peek();
//		currentPlayer.addCard(deck[i]);
//		playersQueue.add(playersQueue.remove()); // move the current player to the end of the queue
//	}
//
//	for (Player player : playersQueue) {
//		player.sortCards();
//		System.out.println(player.getName() + " cards:");
//		for (String card : player.getCards()) {
//			System.out.println(card);
//		}
//		System.out.println();
//	}
//}
//
//private static void shuffle(String[] deck) {
//	Random rnd = new Random();
//	for (int i = DECK_SIZE - 1; i > 0; i--) {
//		int index = rnd.nextInt(i + 1);
//		String temp = deck[index];
//		deck[index] = deck[i];
//		deck[i] = temp;
//	}
//}
//}
//
class Player {

private String name;
private List<String> cards;
private List<String> sortedCards;

public Player(String name) {
	this.name = name;
	this.cards = new ArrayList<>();
	this.sortedCards = new ArrayList<>();
}

public void addCard(String card) {
	cards.add(card);
}

public String getName() {
	return name;
}

public List<String> getCards() {
	return cards;
}

public void sortCards() {
	sortedCards.clear();
	sortedCards.addAll(cards);
	Collections.sort(sortedCards, new Comparator<String>() {
		public int compare(String card1, String card2) {
			String rank1 = card1.substring(0, card1.indexOf(" of"));
			String rank2 = card2.substring(0, card2.indexOf(" of"));
			return Arrays.asList(DeckOfCards.ranks).indexOf(rank1)
					- Arrays.asList(DeckOfCards.ranks).indexOf(rank2);
		}
	});
}
}
}







