package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.tdd.samples.tictactoe.test.MarkedPositionTestFixtureBuilder;

public class LineTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		allTests.addTestSuite(WhenIsStraight.class);
		allTests.addTestSuite(WhenIsMarkedTheSame.class);
		return allTests;
	}
	
	public static class WhenIsStraight extends TestCase {
		public void testGivenNonHorizontalVerticalOrDiagonalLine_ThenReturnFalse() {
			Line nonHorizontalVerticalDiagonalLine = new Line(new MarkedPositionTestFixtureBuilder(3).withRowsAndColumns(new int[][]{{1,1},{1,1},{3,3}}).buildArray());
			
			boolean straight = nonHorizontalVerticalDiagonalLine.isStraight();
			
			assertFalse("Non-Horizontal/Vertical/Diagonal line should not be straight.", straight);
		}

		public void testGivenHorizontalLine_ThenReturnTrue() {
			Line horizontalLine = new Line(new MarkedPositionTestFixtureBuilder(3).withSameRowDifferentColumns(1, new int[]{1,2,3}).buildArray());
			
			boolean straight = horizontalLine.isStraight();
			
			assertTrue("Horizontal line should be straight.", straight);
		}
		
		public void testGivenVerticalLine_ThenReturnTrue() {
			Line verticalLine = new Line(new MarkedPositionTestFixtureBuilder(3).withDifferentRowsAndSameColumn(new int[]{1,2,3}, 1).buildArray());
			
			boolean straight = verticalLine.isStraight();
			
			assertTrue("Vertical line should be straight.", straight);
		}
		
		public void testGivenUpperLeftToLowerRightLine_ThenReturnTrue() {
			Line diagonalLine = new Line(new MarkedPositionTestFixtureBuilder(3).withRowsAndColumns(new int[][]{{1,1},{2,2},{3,3}}).buildArray());
			
			boolean straight = diagonalLine.isStraight();
			
			assertTrue("Vertical line should be straight.", straight);
		}
		
		public void testGivenUpperRightToLowerLeftLine_ThenReturnTrue() {
			Line diagonalLine = new Line(new MarkedPositionTestFixtureBuilder(3).withRowsAndColumns(new int[][]{{1,3},{2,2},{3,1}}).buildArray());
			
			boolean straight = diagonalLine.isStraight();
			
			assertTrue("Vertical line should be straight.", straight);
		}
	}
	
	public static class WhenIsMarkedTheSame extends TestCase {
		public void testGivenAllXMarks_ThenTrue() {
			Line allXMarks = new Line(new MarkedPositionTestFixtureBuilder(3).withMark(Mark.X).buildArray());
			
			boolean markedTheSame = allXMarks.isMarkedTheSame();
			
			assertTrue("All X marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenAllOMarks_ThenTrue() {
			Line allOMarks = new Line(new MarkedPositionTestFixtureBuilder(3).withMark(Mark.O).buildArray());
			
			boolean markedTheSame = allOMarks.isMarkedTheSame();
			
			assertTrue("All O marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenNoMarks_ThenTrue() {
			Line noMarks = new Line(new MarkedPositionTestFixtureBuilder(3).withMark(Mark.NONE).buildArray());
			
			boolean markedTheSame = noMarks.isMarkedTheSame();
			
			assertTrue("No marks should be marked the same.", markedTheSame);
		}
		
		public void testGivenDifferentMarks_ThenFalse() {
			Line differentMarks = new Line(new MarkedPositionTestFixtureBuilder(3).withMarks(Mark.NONE, Mark.O, Mark.X).buildArray());
			
			boolean markedTheSame = differentMarks.isMarkedTheSame();
			
			assertFalse("Different marks should NOT be marked the same.", markedTheSame);
		}
	}

}
