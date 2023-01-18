package enums;

public class Card {
	
	private Suites suite;
	private Numbers number;
	private int value;
	
	public Card (Suites suite, Numbers number) {
		this.suite = suite;
		this.number = number;
		value = number.ordinal() +1;
	}
	
	public Suites getSuite () {
		return this.suite;
	}

	public Numbers getNum () {
		return this.number;
	}

	public static void main (String[] args) {
	}
}
