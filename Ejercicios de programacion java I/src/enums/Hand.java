package enums;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> content = new ArrayList<Card>();
	
	public Hand () {
		for (Suites suite : Suites.values()) {
			for (Numbers number : Numbers.values()) {
				this.content.add(new Card(suite, number));
			}
		}
	}
}
