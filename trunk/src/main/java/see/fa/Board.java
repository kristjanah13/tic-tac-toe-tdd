package see.fa;


public class Board {

	private final Mark[][] marks;

	public Board(Mark[][] marks) {
		this.marks = marks;
	}

	public Board() {
		this(new Mark[][]{
				{Mark.NONE, Mark.NONE, Mark.NONE},
				{Mark.NONE, Mark.NONE, Mark.NONE},
				{Mark.NONE, Mark.NONE, Mark.NONE}
		});
	}

	public void set(Position position, Mark mark) {
		int effectiveRow = position.getX() - 1;
		int effectiveCol = position.getY() - 1;
		
		marks[effectiveRow][effectiveCol] = mark;
	}

}
