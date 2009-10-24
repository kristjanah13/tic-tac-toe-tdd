package org.tdd.samples.tictactoe;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Line {

	private final MarkedPosition[] positions;

	public Line(MarkedPosition[] positions) {
		this.positions = positions;
	}

	public boolean isStraight() {
		return isHorizontal();
	}

	private boolean isHorizontal() {
		boolean horizontal = true;
		Integer rowPosition = null;
		int i = 0;
		while(i < positions.length) {
			if(rowPosition == null) {
				rowPosition = positions[i].getPosition().getEffectiveRow();
			} else {
				horizontal = rowPosition.equals(positions[i].getPosition().getEffectiveRow());
			}
			i++;
		}
		return horizontal;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !Line.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		
		Line that = (Line)obj;
		return new EqualsBuilder()
			.append(this.positions, that.positions)
			.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		    .append(positions)
		    .toHashCode();
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
