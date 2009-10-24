package org.tdd.samples.tictactoe;

import org.apache.commons.lang.builder.EqualsBuilder;

public class MarkedPosition {

	private final Position position;
	private final Mark mark;

	public MarkedPosition(int row, int col, Mark mark) {
		this.position = new Position(row, col);
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !MarkedPosition.class.isAssignableFrom(MarkedPosition.class)) {
			return false;
		}
		
		MarkedPosition that = (MarkedPosition) obj;
		return new EqualsBuilder()
		    .append(this.position, that.position)
		    .append(this.mark, that.mark)
		    .isEquals();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
