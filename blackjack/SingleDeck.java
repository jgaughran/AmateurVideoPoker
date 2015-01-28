/**
 * 
 */
package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Joe
 *
 */
public class SingleDeck {

	private List<Card> deck = new ArrayList<Card>();
	
	/**
	 * 
	 */
	public SingleDeck() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deck.add(new Card(i, j));
			}
		}
	}
	
	public Card DealCard() {
		Card temporaryCard;
		temporaryCard = deck.get(0);
		deck.remove(0);
		return temporaryCard;
	}
	
	public Card[] DealFive() {
		Card[] fiveCardDeal = new Card[5];
		for (int i = 0; i < 5; i++) {
			fiveCardDeal[i] = DealCard();
		}
		return fiveCardDeal;
	}
	
	public void ShuffleDeck() {
		Collections.shuffle(deck);
	}
	
	public void PrintToString() {
		for (Card c : deck) {
			System.out.println(c.toString());
		}
	}

}
