package org.tdd.samples.tictactoe;

import junit.framework.TestCase;

public class LineTest extends TestCase {

	public void testGivenNonHorizontalVerticalOrDiagonalLine_WhenIsStraight_ThenReturnFalse() {
		Line nonHorizontalVerticalDiagonalLine = new Line(new Position[]{new Position(1,1), new Position(1,2), new Position(3,3)});
		
		boolean straight = nonHorizontalVerticalDiagonalLine.isStraight();
		
		assertFalse("Non-Horizontal/Vertical/Diagonal line should not be straight.", straight);
	}

	public void testGivenHorizontalLine_WhenIsStraight_ThenReturnTrue() {
		Line horizontalLine = new Line(new Position[]{new Position(1,1), new Position(1,2), new Position(1,3)});
		
		boolean straight = horizontalLine.isStraight();
		
		assertTrue("Horizontal line should be straight.", straight);
	}
}
