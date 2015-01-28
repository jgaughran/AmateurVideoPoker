/**
 * 
 */
package blackjack;

import java.util.Arrays;

/**
 * @author Joe
 *
 */
public class JacksOrBetter {

	private SingleDeck deck;
	private Card[] hand;
	
	public JacksOrBetter(Card[] h ) {
		hand = h;
	}
	
	private void makeNewDeck() {
		deck = new SingleDeck();
	}
	
	public String testPlay() {
		return evaluateHand().toString();
	}
	
	private WinLossResult evaluateHand() {
		
		//int winMultiplier = 0;
		//String winDescription = "";
		boolean maxbet = false;
		boolean hasThreeOfAKind = false;
		boolean hasPair = false;
		boolean hasTwoPair = false;
		boolean hasStraight = true;
		
		Arrays.sort(hand); //sorts hand by rank
		
		//Enter this if loop if all suits equal
		if (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit() ) {
			if (hand[0].getRank() == 1 && hand[1].getRank() == 10 && hand[4].getRank() == 13) {
				return new WinLossResult(250, "ROYAL FLUSH", maxbet);
			} else if ((hand[0].getRank() + 4) == hand[4].getRank()) {
				return new WinLossResult(50, "STRAIGHT FLUSH", maxbet);
			} else return new WinLossResult(6, "FLUSH", maxbet);
		}
		//Create an array to store count of ranks in hand
		int[] countOfRanks = new int[14];
		for (Card c : hand) {
			countOfRanks[c.getRank()]++;
		}
		for (int i : countOfRanks) {
			if (i == 4) {
				return new WinLossResult(25, "FOUR OF A KIND", maxbet);
			} if (i == 3) {
				hasThreeOfAKind = true;
			} if (i == 2 && hasPair) {
				hasTwoPair = true;
			} if (i == 2) {
				hasPair = true;
			}
		}
		if (hasThreeOfAKind && hasPair) {
			return new WinLossResult(9, "FULL HOUSE", maxbet);
		}
		for (int i = 0; i < 4; i++) { // set hasStraight = false if not 5 consecutive hards
			if (hand[i].getRank() + 1 != hand[i+1].getRank()) {
				hasStraight = false;
			} 
		}
		if (hand[0].getRank() == 1 && hand[1].getRank() == 10) { //set hasStraight = true for ace high straight
			hasStraight = true;
			for (int i = 1; i < 4; i++) {
				if (hand[i].getRank() + 1 != hand[i+1].getRank()) {
					hasStraight = false;
				}
			}
		}
		if (hasStraight) {
			return new WinLossResult(4, "STRAIGHT", maxbet);
		}
		if (hasThreeOfAKind) {
			return new WinLossResult(3, "3 OF A KIND", maxbet);
		}
		if (hasTwoPair) {
			return new WinLossResult(1,  "TWO PAIRS", maxbet);
		}
		if (countOfRanks[0] == 2) {
			return new WinLossResult(1, "JACKS OR BETTER", maxbet);
		}
		for (int i = 11; i <= 13; i++) {
			if (countOfRanks[i] == 2) {
				return new WinLossResult(1, "JACKS OR BETTER", maxbet);
			}
		}
		return new WinLossResult(0, "LOSE", maxbet);
		
	}
}
