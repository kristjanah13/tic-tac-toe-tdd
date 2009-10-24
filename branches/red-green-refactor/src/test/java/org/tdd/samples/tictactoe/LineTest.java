package org.tdd.samples.tictactoe;

import junit.framework.TestCase;

public class LineTest extends TestCase {

	public void testGivenNonHorizontalVerticalOrDiagonalLine_WhenIsStraight_ThenReturnFalse() {
		Mark dummyMark = Mark.NONE;
		Line nonHorizontalVerticalDiagonalLine = new Line(new MarkedPosition[]{new MarkedPosition(1,1,dummyMark), new MarkedPosition(1,2,dummyMark), new MarkedPosition(3,3,dummyMark)});
		
		boolean straight = nonHorizontalVerticalDiagonalLine.isStraight();
		
		assertFalse("Non-Horizontal/Vertical/Diagonal line should not be straight.", straight);
	}

	public void testGivenHorizontalLine_WhenIsStraight_ThenReturnTrue() {
		Mark dummyMark = Mark.NONE;
		Line horizontalLine = new Line(new MarkedPosition[]{new MarkedPosition(1,1,dummyMark), new MarkedPosition(1,2,dummyMark), new MarkedPosition(1,3,dummyMark)});
		
		boolean straight = horizontalLine.isStraight();
		
		assertTrue("Horizontal line should be straight.", straight);
	}
}
