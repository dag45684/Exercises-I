package enums;

public enum Suites {
	PIKES('p'), HEARTS('h'), DIAMONDS('t'), CLUBS('c');

	private char symbol;
	
	Suites(char symbol){
		this.symbol = symbol;
	}
	
	public char getSymbol () {
		return symbol;
	}
}
