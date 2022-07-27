package MankathaGame;

public class Card {

	private String rank;
	private String suit;
	
	private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String rank, String suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
	
	
}
