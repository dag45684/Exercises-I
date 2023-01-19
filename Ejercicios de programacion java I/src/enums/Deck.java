package enums;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private Random random = new Random();
	private ArrayList<Card> content = new ArrayList<Card>();
	
	public Deck () {
		for (Suites suite : Suites.values()) {
			for (Numbers number : Numbers.values()) {
				this.content.add(new Card(suite, number));
			}
		}
	}
	public Deck(int n) {
		for(int i=0; i<n; i++) {
			for (Suites suite : Suites.values()) {
				for (Numbers number : Numbers.values()) {
					this.content.add(new Card(suite, number));
				}
			}
		}
	}
	
	public ArrayList<Card> getContent () {
		return this.content;
	}
	public Card drawCard () {
		return content.get(random.nextInt(content.size()));
	}
	public Card removeCard () {
		int n = random.nextInt();
		Card c = content.get(n);
		content.remove(n);
		return c;
	}
	public void addCard(Card c) {
		content.add(c);
	}
	public void addDeck(Deck d) {
		for (Card c : d.getContent()) { this.content.add(c); }
	}
}
