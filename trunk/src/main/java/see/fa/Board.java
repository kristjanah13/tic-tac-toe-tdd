package see.fa;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Board {

	private static final String COL_SEPARATOR = " ";
	private static final String ROW_SEPARATOR = "\n";
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

	public Row getRow(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !Board.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		
		Board that = (Board)obj;
		
		return new EqualsBuilder()
			.append(this.marks, that.marks)
			.isEquals();
	}

	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
		hashCodeBuilder.append(marks);
		return hashCodeBuilder.toHashCode();
	}

	@Override
	public String toString() {
		List<String> rowToStrings = new LinkedList<String>();
		for(Mark[] row : marks) {
			rowToStrings.add(StringUtils.join(row, COL_SEPARATOR));
		}
		
		return new StringBuilder()
			.append(ROW_SEPARATOR)
			.append(StringUtils.join(rowToStrings, ROW_SEPARATOR))
			.append(ROW_SEPARATOR)
			.toString();
	}

	
	

}
