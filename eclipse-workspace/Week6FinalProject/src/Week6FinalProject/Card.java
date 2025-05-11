package Week6FinalProject;

public class Card {
	private int value; 						// Int from 2-14.
	private String name;					// String representing card.
	
	public Card(int value, String name) {	// Constructor initializing a Card with a given value and name.
		this.value = value;
		this.name = name;
	}

	public int getValue() {						// Getter for value.
		return value;
	}

	public void setValue(int value) {			// Setter for value.
		this.value = value;
	}

	public String getName() {					// Getter for name.
		return name;
	}

	public void setName(String name) {			// Setter for name.
		this.name = name;
	}
	public void describe() {					// Prints the card's name.
		System.out.println("Card: " + name);
	}
}
