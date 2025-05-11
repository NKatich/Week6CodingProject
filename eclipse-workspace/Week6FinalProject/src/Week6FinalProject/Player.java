package Week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;					// List called "hand" to hold player cards.
	private int score;							// Int called "score" to hold player scores.
	private String name;						// String called "name" to hold player names.
	
	public Player(String name) {				// Constructor: Initializes a player with a name, empty hand, score of 0.
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}

	public List<Card> getHand() {				// Getter for hand.
		return hand;
	}

	public void setHand(List<Card> hand) {		// Setter for hand.
		this.hand = hand;
	}

	public int getScore() {						// Getter for score.
		return score;
	}

	public void setScore(int score) {			// Setter for score.
		this.score = score;
	}

	public String getName() {					// Getter for name.
		return name;
	}

	public void setName(String name) {			// Setter for name.
		this.name = name;
	}
	
	public void describe() {												// Prints player's name and score, and calls the describe() method for
		System.out.println("Player " + name + " --- Score: " + score);		// each card in that player's hand.
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("---");
	}
	
	public Card flip() {													// Removes and returns the card at the top of the player's hand at index 0, or...
		if (!hand.isEmpty()) {												// returns null if the hand is empty.
			return hand.remove(0);
		}
		return null;
	}
	
	public void draw(Deck deck) {											// Takes the "Deck" object as an input, calls the draw() method onto the deck,
		Card drawnCard = deck.draw();										// and adds the drawn card to the player's hand.
		if (drawnCard != null) {
			this.hand.add(drawnCard);
		}
	}
	
	public void incrementScore() {											// Increases the player's score by 1.
		this.score++;
	}
}
