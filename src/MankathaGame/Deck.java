package MankathaGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	private int totalCards = 52;
	private List<Card> cards;

	public Deck() {
		
		
		// TODO Auto-generated constructor stub
		 for(int a =0; a<=3; a++)
	        {
	            for(int b =0; b<=12;b++)
	            {
	                cards.add(drawRandomCard());
	            }
	            cards.addAll(cards);
	        }
	}

	private Card drawRandomCard() {
		Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
	}

	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	public void shuffle() {
		
		 Collections.shuffle(cards);
	}
	
	
	public Card deal() {
		Card card = cards.remove(0);
		return card;
		
	}
}
