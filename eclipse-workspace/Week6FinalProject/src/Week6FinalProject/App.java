package Week6FinalProject;

public class App {

	public static void main(String[] args) {
		// Starts with making a deck for two players.
		
		System.out.println("New game!");
		Deck deck = new Deck();						// Makes new instance of Deck.
		Player player1 = new Player("Player 1");	// Makes new player "Player 1"
		Player player2 = new Player("Player 2");	// Makes new player "Player 2"
		
		// Shuffles the deck.
		
		deck.shuffle();									// Calls shuffle function.
		System.out.println("Deck has been shuffled.");	// Check stage to make sure it works; prints to console.
		
		// Deal 26 cards to each player.
		
		for (int i = 0; i < 26; i++) {		// For loop, counts to 26.
			player1.draw(deck);				// Draws one card for player 1, and then...
			player2.draw(deck);				// draws one card for player 2...
		}									// for a total of 52 cards, or the full deck.
		
		System.out.println("Cards have been dealt to both players.\n"); // Check stage to make sure it works; prints to console.
		
		// Game Play
		
		System.out.println("---Game Start---");
		for (int i = 1; i <= 26; i++) {									// For loop counting which round it is currently.
			System.out.println("\n--- Round " + i + "---");
			
			Card card1 = player1.flip();								// Calls the flip method for each player, new instance each iteration.
			Card card2 = player2.flip();
			
			if (card1 != null && card2 != null) {						//	Checks if there are still cards in each players hand. If not, breaks loop on ln. 53 to end game.
				System.out.println(player1.getName() + " flips: ");		// If cards still in hand, flips card and uses describe method to read out cards.
				card1.describe();
				System.out.println(player2.getName() + " flipe: ");
				card2.describe();
				
				if (card1.getValue() > card2.getValue()) {											// Checks which card is higher, and awards points to whichever player has
					player1.incrementScore();														// high card. Else, if a draw occurs, ln. 49 prints out tie round.
					System.out.println(player1.getName() + " wins this round and gets a point.");
				} else if (card2.getValue() > card1.getValue()) {
					player2.incrementScore();
					System.out.println(player2.getName() + " wins this round and gets a point.");
				} else {
					System.out.println("Tie! No points to either player.");
				}
																									// After each round, will print current score to the console.
				System.out.println("Current Score --" + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
			} else {
				System.out.println("One of the players ran out of cards.");				
				break; // Ends the game if someone runs out of cards.
			}
		}
		
		// Win conditions
		
		System.out.println("\n---Game Over---");												// Prints final score at end of game.
		System.out.println("Final Score --" + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {					// Checks which player has higher score, and prints to console. If both scores are equal,
			System.out.println(player1.getName() + " is the winner.");	// game declares a draw.2
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " is the winner.");
		} else {
			System.out.println("Draw");
		}
	}
}
		
	



