package org.tdd.samples.tictactoe;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Board {
	
	private static final String ROW_SEPARATOR = "\n";
	private static final String COL_SEPARATOR = " ";
	private final Mark[][] marks;
	
	public Board() {
		this(new Mark[][]{
				{Mark.NONE, Mark.NONE, Mark.NONE},
				{Mark.NONE, Mark.NONE, Mark.NONE},
				{Mark.NONE, Mark.NONE, Mark.NONE}
		});
	}

	public Board(Mark[][] marks) {
		this.marks = marks;
	}

	public void set(MarkedPosition markedPosition) {
		marks[markedPosition.getPosition().getEffectiveRow()][markedPosition.getPosition().getEffectiveColumn()] = markedPosition.getMark();
	}

	public boolean contains(Position position) {
		return marks[position.getEffectiveRow()][position.getEffectiveColumn()] != Mark.NONE;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !obj.getClass().isAssignableFrom(Board.class)) {
			return false;
		}
		
		Board that = (Board) obj;
		
		EqualsBuilder equalsBuilder = new EqualsBuilder();
		equalsBuilder.append(this.marks, that.marks);
		return equalsBuilder.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(marks)
			.toHashCode();
	}

	@Override
	public String toString() {
		List<String> marksPerRow = new LinkedList<String>();
		for(Mark[] row : marks) {
			marksPerRow.add(StringUtils.join(row, COL_SEPARATOR));
		}

		return new StringBuilder()
			.append("{")
			.append("\n")
			.append(StringUtils.join(marksPerRow, ROW_SEPARATOR))
			.append("}").toString();
	}

}