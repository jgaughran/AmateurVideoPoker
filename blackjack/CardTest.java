package blackjack;

public class CardTest {
	
	public static void main(String[] args) {
		Card[] testCards = new Card[52];
		int k = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				testCards[k++] = new Card (i , j);
				System.out.println(testCards[k-1].toString());
			}
			
		}

	}

}
