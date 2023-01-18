package enums;

public enum Numbers {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, QUEEN, KING;

	public boolean isFig () {
		return this == J || this == QUEEN || this == KING;
	}
}
