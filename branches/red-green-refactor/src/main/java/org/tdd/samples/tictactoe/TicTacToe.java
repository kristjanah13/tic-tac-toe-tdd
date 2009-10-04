package org.tdd.samples.tictactoe;

public class TicTacToe {

	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public void move(MarkedPosition markedPosition) {
		if(board.isMarked(markedPosition.getPosition())) {
			throw new IllegalMoveException(new StringBuilder()
				.append(markedPosition.getPosition())
				.append(" is already occupied.")
				.toString());
		}
		
		board.set(markedPosition);
	}

	public Board getBoard() {
		return  board;
	}

}
