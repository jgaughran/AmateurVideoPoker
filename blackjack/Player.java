package blackjack;

public class Player {
	

	private int bankRoll;
	private Card[] hand = new Card[5];
	
	public Player(int startingBankRoll) {
		bankRoll = startingBankRoll;
	}
	
	public Player(int startingBankRoll, Card[] startingHand) {
		bankRoll = startingBankRoll;
		hand = startingHand;
	}
	
	public void dealHand(Card[] nextHand) {
		for (int i = 0; i < 5; i++) {
			hand = nextHand;
		}
	}
	
	public void setBankRoll(int newBankRoll) {
		bankRoll = newBankRoll;
	}
	
	public void setHand(Card[] newCards) {
		hand = newCards;
	}
	
	public int getBankRoll() {
		return bankRoll;
	}
	
	public Card[] getHand() {
		return hand;
	}
	
	public String toString() {
		String s = "Bankroll is " + bankRoll + " Cards are: ";
		for (Card c : hand) {
			s+= c.toString() + " ";
		}
		return s;
	}

	

}
