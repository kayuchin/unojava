package uno;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> handcard;
	
	public Player(String s, ArrayList<Card> c){
		this.name = s;
		this.handcard = c;
	}
	
	public Card removeCard(int i){
		return this.handcard.remove(i);	
	}
	
	public void addCard(Card c){
		this.handcard.add(c);
	}
}
