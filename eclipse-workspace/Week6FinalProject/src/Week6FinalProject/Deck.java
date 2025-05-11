package Week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;											// List initialized called "cards" to hold Card objects.
	
	public Deck() {														// Constructor called "Deck"; will make a new 52 card deck when instantiated.
		cards = new ArrayList<>();										// New array to hold cards.
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};																	// These String arrays hold all possible 
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};	// suits, ranks, and values of cards.
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {													// For loop, adding a first the suit... 
            for (int i = 0; i < ranks.length; i++) {								// then the rank of each new card...
                cards.add(new Card(values[i], ranks[i] + " of " + suit));			// and adds it to the array to form a deck.
			}
		}
	}
	
	public void shuffle() {															// Uses the Collections.shuffle() function to randomize the cards in the array once made.
		Collections.shuffle(cards);
	}
	
	public Card draw() {															// This will draw a card from the first index ("top of deck").
		if (!cards.isEmpty()) {														// Checks to see if the array is empty, and if it is, will return null.
			return cards.remove(0);
		}
		return null;
	}
}
