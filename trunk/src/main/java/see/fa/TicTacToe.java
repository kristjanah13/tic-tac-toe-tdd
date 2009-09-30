package see.fa;

public class TicTacToe {
	
	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public Result move(Position position, Mark mark) {
		board.set(position, mark);
		return null;
	}

	public Board getBoard() {
		return board;
	}

}
