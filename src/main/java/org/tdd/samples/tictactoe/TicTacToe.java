package org.tdd.samples.tictactoe;

public class TicTacToe {

	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public Result move(MarkedPosition markedPosition) {
		if(markedPosition.getMark() != Mark.X && markedPosition.getMark() != Mark.O ) {
			throw new IllegalMoveException(new StringBuilder()
				.append(markedPosition.getMark())
				.append(" is not a valid mark.")
				.toString());
		} else if(!board.contains(markedPosition.getPosition())) {
			throw new IllegalMoveException(new StringBuilder()
				.append(markedPosition.getPosition())
				.append(" is outside the board.")
				.toString());
		} else if(board.isMarked(markedPosition.getPosition())) {
			throw new IllegalMoveException(new StringBuilder()
				.append(markedPosition.getPosition())
				.append(" is already occupied.")
				.toString());
		}
		
		board.set(markedPosition);
		
		Line line = board.getRow(markedPosition.getPosition());
		Result result;
		if(line.isStraight()) {
			result = markedPosition.getMark() == Mark.X ? Result.X_WINS : Result.O_WINS;
		} else {
			result = Result.GAME_IS_ONGOING;
		}
		
		return result;
	}

	public Board getBoard() {
		return  board;
	}

}
