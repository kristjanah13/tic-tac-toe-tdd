package org.tdd.samples.tictactoe;

public class MarkedPosition {

	private final int col;
	private final int row;
	private final Mark mark;

	public MarkedPosition(int row, int col, Mark mark) {
		this.row = row;
		this.col = col;
		this.mark = mark;
	}

	public int getEffectiveColumn() {
		return col - 1;
	}

	public int getEffectiveRow() {
		return row - 1;
	}

	public Mark getMark() {
		return mark;
	}

}
