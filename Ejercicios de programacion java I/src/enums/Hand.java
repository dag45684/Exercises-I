package enums;

import java.util.ArrayList;

public class Hand {

	ArrayList<Card> content = new ArrayList<Card>();
	
	public Hand () {
		for (Suites suite : Suites.values()) {
			for (Numbers number : Numbers.values()) {
				content.add(new Card(suite, number));
			}
		}
	}
}
