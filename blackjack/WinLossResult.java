package blackjack;

public class WinLossResult {
	private int winMultiplier;
	private String winDescription;
	
	public WinLossResult(int winMultiplier, String winDescription, boolean maxbet) {
		this.winMultiplier = winMultiplier;
		this.winDescription = winDescription;
	}
	
	public String toString() {
		return ("winMultiplier = " + winMultiplier + " winDescription = " + winDescription);
	}
}
