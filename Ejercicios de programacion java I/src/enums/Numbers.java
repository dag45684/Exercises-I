package enums;

public enum Numbers {
	TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

	public boolean isFig () {
		return this == JACK || this == QUEEN || this == KING || this == ACE;
	}
}