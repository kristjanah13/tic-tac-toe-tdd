package see.fa;

public class TicTacToe {
	
	private final Board board;
	
	public TicTacToe() {
		board = new Board();
	}

	public void move(Position position, Mark mark) {
		board.set(position, mark);
	}

	public Board getBoard() {
		return board;
	}

}
