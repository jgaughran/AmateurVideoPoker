package blackjack;

public class SingleDeckTest {

	public static void main(String[] args) {
		SingleDeck testDeck = new SingleDeck();
		testDeck.PrintToString();
		System.out.println();
		testDeck.ShuffleDeck();
		testDeck.PrintToString();
		System.out.println();
		for (int i = 0; i < 50; i++) {
			testDeck.DealCard();
		}
		testDeck.PrintToString();

	}

}
