package org.tdd.samples.tictactoe;

public class TicTacToe {

	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public void move(MarkedPosition markedPosition) {
		board.set(markedPosition);
	}

	public Board getBoard() {
		return  board;
	}

}
