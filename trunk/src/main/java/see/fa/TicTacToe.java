package see.fa;


public class TicTacToe {
	
	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public Result move(Position position, Mark mark) {
		board.set(position, mark);
		
		Result rowResult = Result.valueOf(board.getRow(position));
		if(rowResult != Result.GAME_NOT_FINISH) {
			return rowResult;
		}
		
		Result colResult = Result.valueOf(board.getCol(position));
		if(colResult != Result.GAME_NOT_FINISH) {
			return colResult;
		}
		
		Result diagResult = Result.valueOf(board.getDiag(position));
		if(diagResult != Result.GAME_NOT_FINISH) {
			return diagResult;
		}
		
		return Result.GAME_NOT_FINISH; 
	}

	public Board getBoard() {
		return board;
	}

}
