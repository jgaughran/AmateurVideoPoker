package blackjack;

public class JacksOrBetterTest {

	public static void main(String[] args) {
		//Card[] testHand = new Card[5];
		Card aceOfHearts = new Card(1,1);
		Card twoOfHearts = new Card(1,2);
		Card nineOfHearts = new Card(1,9);
		Card tenOfHearts = new Card(1,10);
		Card jackOfHearts = new Card(1,11);
		Card queenOfHearts = new Card(1,12);
		Card kingOfHearts = new Card(1,13);
		Card aceOfClubs = new Card(2,1);
		Card jackOfClubs = new Card(2,11);
		Card aceOfDiamonds = new Card(3,1);
		Card aceOfSpades = new Card(4,1);
		 
		
		//Royal Flush 	250x
		Card[] royalFlushTestHand = {aceOfHearts, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts};
		JacksOrBetter testJOBRoyalFlush = new JacksOrBetter(royalFlushTestHand);
		System.out.println(testJOBRoyalFlush.testPlay());
		//Straight Flush	50x
		Card[] straightFlushTestHand = {nineOfHearts, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts};
		JacksOrBetter testJOBStraightFlush = new JacksOrBetter(straightFlushTestHand);
		System.out.println(testJOBStraightFlush.testPlay());
		//Four of a kind	25x
		Card[] fourOfAKindTestHand = {aceOfClubs, aceOfDiamonds, aceOfHearts, aceOfSpades, kingOfHearts};
		JacksOrBetter testJOBFourOfAKind = new JacksOrBetter(fourOfAKindTestHand);
		System.out.println(testJOBFourOfAKind.testPlay());
		//Full House		9x
		Card[] fullHouseTestHand = {aceOfClubs, aceOfDiamonds, aceOfHearts, jackOfClubs, jackOfHearts};
		JacksOrBetter testJOBFullHouse = new JacksOrBetter(fullHouseTestHand);
		System.out.println(testJOBFullHouse.testPlay());
		//Flush			6x
		Card[] flushTestHand = {twoOfHearts, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts};
		JacksOrBetter testJOBFlush = new JacksOrBetter(flushTestHand);
		System.out.println(testJOBFlush.testPlay());
		//Straight		4x
		Card[] straightTestHand = {aceOfClubs, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts};
		JacksOrBetter testJOBStraight = new JacksOrBetter(straightTestHand);
		System.out.println(testJOBStraight.testPlay());
		//Three of a kind	3x
		Card[] threeOfAKindTestHand = {aceOfClubs, aceOfDiamonds, aceOfHearts, jackOfClubs, queenOfHearts};
		JacksOrBetter testJOB3OfAKind = new JacksOrBetter(threeOfAKindTestHand);
		System.out.println(testJOB3OfAKind.testPlay());
		//Two Pairs		2x
		Card[] twoPairTestHand = {aceOfClubs, aceOfDiamonds, tenOfHearts, jackOfClubs, jackOfHearts};
		JacksOrBetter testJOBTwoPair = new JacksOrBetter(twoPairTestHand);
		System.out.println(testJOBTwoPair.testPlay());
		//Jacks or Better	1x
		Card[] jacksOrBetterTestHand = {jackOfClubs, jackOfHearts, queenOfHearts, kingOfHearts, aceOfClubs};
		JacksOrBetter testJOBJacksOrBetter = new JacksOrBetter(jacksOrBetterTestHand);
		System.out.println(testJOBJacksOrBetter.testPlay());

	}

}
