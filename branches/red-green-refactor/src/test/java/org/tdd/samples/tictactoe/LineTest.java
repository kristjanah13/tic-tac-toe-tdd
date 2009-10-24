package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LineTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		allTests.addTestSuite(WhenIsStraight.class);
		allTests.addTestSuite(WhenIsMarkedTheSame.class);
		return allTests;
	}
	
	public static class WhenIsStraight extends TestCase {
		public void testGivenNonHorizontalVerticalOrDiagonalLine_ThenReturnFalse() {
			Mark dummyMark = Mark.NONE;
			Line nonHorizontalVerticalDiagonalLine = new Line(new MarkedPosition[]{new MarkedPosition(1,1,dummyMark), new MarkedPosition(1,2,dummyMark), new MarkedPosition(3,3,dummyMark)});
			
			boolean straight = nonHorizontalVerticalDiagonalLine.isStraight();
			
			assertFalse("Non-Horizontal/Vertical/Diagonal line should not be straight.", straight);
		}

		public void testGivenHorizontalLine_ThenReturnTrue() {
			Mark dummyMark = Mark.NONE;
			Line horizontalLine = new Line(new MarkedPosition[]{new MarkedPosition(1,1,dummyMark), new MarkedPosition(1,2,dummyMark), new MarkedPosition(1,3,dummyMark)});
			
			boolean straight = horizontalLine.isStraight();
			
			assertTrue("Horizontal line should be straight.", straight);
		}
	}
	
	public static class WhenIsMarkedTheSame extends TestCase {
		public void testGivenAllXMarks_ThenTrue() {
			int dummyRow = 1;
			int dummyCol = 1;
			Line allXMarks = new Line(new MarkedPosition[]{new MarkedPosition(dummyRow,dummyCol,Mark.X), new MarkedPosition(dummyRow,dummyCol,Mark.X), new MarkedPosition(dummyRow,dummyCol,Mark.X)});
			
			boolean markedTheSame = allXMarks.isMarkedTheSame();
			
			assertTrue("All X marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenAllOMarks_ThenTrue() {
			int dummyRow = 1;
			int dummyCol = 1;
			Line allOMarks = new Line(new MarkedPosition[]{new MarkedPosition(dummyRow,dummyCol,Mark.O), new MarkedPosition(dummyRow,dummyCol,Mark.O), new MarkedPosition(dummyRow,dummyCol,Mark.O)});
			
			boolean markedTheSame = allOMarks.isMarkedTheSame();
			
			assertTrue("All O marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenNoMarks_ThenTrue() {
			int dummyRow = 1;
			int dummyCol = 1;
			Line noMarks = new Line(new MarkedPosition[]{new MarkedPosition(dummyRow,dummyCol,Mark.NONE), new MarkedPosition(dummyRow,dummyCol,Mark.NONE), new MarkedPosition(dummyRow,dummyCol,Mark.NONE)});
			
			boolean markedTheSame = noMarks.isMarkedTheSame();
			
			assertTrue("No marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenDifferentMarks_ThenFalse() {
			int dummyRow = 1;
			int dummyCol = 1;
			Line differentMarks = new Line(new MarkedPosition[]{new MarkedPosition(dummyRow,dummyCol,Mark.X), new MarkedPosition(dummyRow,dummyCol,Mark.O), new MarkedPosition(dummyRow,dummyCol,Mark.NONE)});
			
			boolean markedTheSame = differentMarks.isMarkedTheSame();
			
			assertFalse("Different marks should NOT be marked the same.", markedTheSame);
		}
	}

}
