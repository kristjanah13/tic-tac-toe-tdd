package org.tdd.samples.tictactoe;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Line {

	private final Position[] positions;

	public Line(Position[] positions) {
		this.positions = positions;
	}

	public boolean areAllTheSame() {
		return false;
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
