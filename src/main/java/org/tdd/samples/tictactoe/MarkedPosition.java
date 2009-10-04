package org.tdd.samples.tictactoe;

public class MarkedPosition {

	private final Position position;
	private final Mark mark;

	public MarkedPosition(int row, int col, Mark mark) {
		this.position = new Position(row, col);
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public Position getPosition() {
		return position;
	}

}
