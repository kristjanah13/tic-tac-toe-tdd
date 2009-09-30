package see.fa;

import java.util.LinkedList;
import java.util.List;


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

	public Line getRow(Position position) {
		int effectiveRow = position.getX() - 1;
		return new Line(marks[effectiveRow]);
	}

	public Line getCol(Position position) {
		int effecitveCol = position.getY() - 1;
		List<Mark> lineMarks = new LinkedList<Mark>();
		for(Mark[] row : marks) {
			lineMarks.add(row[effecitveCol]);
		}
		return new Line(lineMarks);
	}

	public Line getDiag(Position position) {
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !Board.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		
		Board that = (Board)obj;
		
		return Mark.equals(this.marks, that.marks);
	}

	@Override
	public int hashCode() {
		return Mark.hashCode(marks);
	}

	@Override
	public String toString() {
		return Mark.toString(marks);
	}

}
