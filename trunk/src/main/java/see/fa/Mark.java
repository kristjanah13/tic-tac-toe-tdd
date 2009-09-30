package see.fa;

import org.apache.commons.lang.builder.EqualsBuilder;

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

	public static boolean equals(Mark[] lhs, Mark[] rhs) {
		return equals(new Mark[][]{lhs}, new Mark[][]{rhs});
	}

	public static boolean equals(Mark[][] lhs, Mark[][] rhs) {
		return new EqualsBuilder()
			.append(lhs, rhs)
			.isEquals();
	}

	public static int hashCode(Mark[]... marks) {
		return 0;
	}

}
