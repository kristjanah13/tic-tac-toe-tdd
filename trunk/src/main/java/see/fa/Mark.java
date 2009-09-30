package see.fa;

public enum Mark {

	X('X'), O('O'), NONE('_');

	private final char symbol;

	private Mark(char symbol){
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return String.valueOf(symbol);
	}
}
