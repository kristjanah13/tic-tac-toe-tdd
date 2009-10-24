package org.tdd.samples.tictactoe;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.tdd.samples.tictactoe.util.NumberUtil;

public class Line {

	private final MarkedPosition[] positions;

	public Line(MarkedPosition[] positions) {
		this.positions = positions;
	}

	public boolean isStraight() {
		return isHorizontal() || isVertical() || isDiagonal();
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
	
	private boolean isVertical() {
		boolean vertical = true;
		Integer colPosition = null;
		int i = 0;
		while(i < positions.length) {
			if(colPosition == null) {
				colPosition = positions[i].getPosition().getEffectiveColumn();
			} else {
				vertical = colPosition.equals(positions[i].getPosition().getEffectiveColumn());
			}
			i++;
		}
		return vertical;
	}
	
	private boolean isDiagonal() {
		List<MarkedPosition> markedPositionList = Arrays.asList(positions);
		Collections.sort(markedPositionList);
		
		List<Integer> columns = new LinkedList<Integer>();
		for(MarkedPosition position : markedPositionList) {
			columns.add(position.getPosition().getEffectiveColumn());
		}
		
		return NumberUtil.getOrder(columns) != null;
	}

	public boolean isMarkedTheSame() {
		boolean markedTheSame = true;
		Mark mark = null;
		int i = 0;
		while(i < positions.length) {
			if(mark == null) {
				mark = positions[i].getMark();
			} else {
				markedTheSame = mark.equals(positions[i].getMark());
			}
			i++;
		}
		return markedTheSame;
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
