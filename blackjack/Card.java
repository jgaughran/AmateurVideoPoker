/**
 * 
 */
package blackjack;

/**
 * @author Joe
 *
 */
public class Card implements Comparable<Card>{
	
	/*
	 * suit 1 = Hearts
	 * suit 2 = Clubs
	 * suit 3 = Diamonds
	 * suit 4 = Spades
	 * ~
	 * rank 1 = Ace
	 * rank 13 = King   
	 */
	private int rank;
	private int suit;
	
	
	/**
	 * 
	 */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String getSuitToString() {
		String suitToString;
		switch (suit) {
			case 1: suitToString = "Hearts";
				break;
			case 2: suitToString = "Clubs";
				break;
			case 3: suitToString = "Diamonds";
				break;
			case 4: suitToString = "Spades";
				break;
			default: suitToString = "Bad Suit";
				break;
		}
		return suitToString;
	}
	
	public String getRankToString() {
		String rankToString;
		switch (rank) {
			case 1: rankToString = "Ace";
				break;
			case 2: rankToString = "Two";
				break;
			case 3: rankToString = "Three";
				break;
			case 4: rankToString = "Four";
				break;
			case 5: rankToString = "Five";
				break;
			case 6: rankToString = "Six";
				break;
			case 7: rankToString = "Seven";
				break;
			case 8: rankToString = "Eight";
				break;
			case 9: rankToString = "Nine";
				break;
			case 10: rankToString = "Ten";
				break;
			case 11: rankToString = "Jack";
				break;
			case 12: rankToString = "Queen";
				break;
			case 13: rankToString = "King";
				break;
			default: rankToString = "Bad Rank";
				break;
		}
		return rankToString;
	}
	
	public String toString() {
		return (getRankToString() + " of " + getSuitToString());
	}

	@Override
	public int compareTo(Card o) {
		if (o.rank < this.rank) {
			return 1;
		} else if (o.rank > this.rank) {
			return -1;
		} else return 0;
		
	}
	
}
