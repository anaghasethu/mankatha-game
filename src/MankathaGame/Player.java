package MankathaGame;

public class Player {
	
	private String name;
	private int coins;
	private Card ChosenCard;
	private String chosenOrientation;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int coins, Card chosenCard, String chosenOrientation) {
		super();
		this.name = name;
		this.coins = coins;
		ChosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public Card getChosenCard() {
		return ChosenCard;
	}
	public void setChosenCard(Card chosenCard) {
		ChosenCard = chosenCard;
	}
	public String getChosenOrientation() {
		return chosenOrientation;
	}
	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}
	
	
	public void bet(int coins) {
		
		
	}
	
	public void addWinnings(int coins) {
		
	}
	

}
