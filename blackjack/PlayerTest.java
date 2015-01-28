package blackjack;

import java.util.Arrays;

public class PlayerTest {

	public static void main(String[] args) {
		Player testPlayer1 = new Player(500);
		System.out.println("Bankroll is 500 " + (testPlayer1.getBankRoll() == 500));
		Card[] testPlayer1hand = new Card[5];
		testPlayer1hand[0] = new Card(3,1);
		testPlayer1hand[1] = new Card(1,2);
		testPlayer1hand[2] = new Card(2,3);
		testPlayer1hand[3] = new Card(1,12);
		testPlayer1hand[4] = new Card(2,1);
		testPlayer1.setHand(testPlayer1hand);
		System.out.println(testPlayer1.toString());
		Arrays.sort(testPlayer1hand);
		System.out.println(testPlayer1.toString());
		
	}

}
