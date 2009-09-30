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
		if(rowResult != Result.GAME_NOT_FINISH) {
			return colResult;
		}
		
		return Result.GAME_NOT_FINISH; 
	}

	public Board getBoard() {
		return board;
	}

}
