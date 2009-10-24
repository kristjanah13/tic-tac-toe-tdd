package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BoardTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		allTests.addTestSuite(WhenSet.class);
		allTests.addTestSuite(WhenContains.class);
		allTests.addTestSuite(WhenIsMarked.class);
		allTests.addTestSuite(WhenGetRow.class);
		return allTests;
	}
	
	public abstract static class AbstractBoardTest extends TestCase {
		protected Board board;
		
		@Override
		protected void setUp() throws Exception {
			super.setUp();
			board = new Board();
		}

		@Override
		protected void tearDown() throws Exception {
			board = null;
			super.tearDown();
		}
	}
	
	public static class WhenSet extends AbstractBoardTest {
		public void testShouldUpdateBoard() {
			MarkedPosition givenMarkedPosition = new MarkedPosition(1, 1, Mark.X);
			
			board.set(givenMarkedPosition);
			
			assertEquals("Should have marked the position.", 
					new Board(new Mark[][]{
							{Mark.X, Mark.NONE, Mark.NONE}, 
							{Mark.NONE, Mark.NONE, Mark.NONE}, 
							{Mark.NONE, Mark.NONE, Mark.NONE}
					}), 
					board);
		}
	}
	
	public abstract static class GivenNonEmptyBoard extends AbstractBoardTest {
		@Override
		protected void setUp() throws Exception {
			super.setUp();
			board = new Board(new Mark[][]{
					{Mark.X, Mark.NONE, Mark.NONE}, 
					{Mark.NONE, Mark.NONE, Mark.NONE}, 
					{Mark.NONE, Mark.NONE, Mark.NONE}
			});
		}
	}
	
	public static class WhenContains extends GivenNonEmptyBoard {
		public void testGivenPositionWithinTheBoard_ThenReturnTrue() {
			Position givenPositionThatIsInsideTheBoard = new Position(3, 3);
			
			boolean actualContains = board.contains(givenPositionThatIsInsideTheBoard);
			
			assertTrue(new StringBuilder()
						.append("Should have been TRUE because board ").append(board)
						.append(" contains position ").append(givenPositionThatIsInsideTheBoard)
						.toString() , actualContains);
		}
		
		public void testGivenPositionOutsideTheBoard_ThenReturnTrue() {
			Position givenPositionThatIsOutsideTheBoard = new Position(4, 4);
			
			boolean actualContains = board.contains(givenPositionThatIsOutsideTheBoard);
			
			assertFalse(new StringBuilder()
						.append("Should have been FALSE because board ").append(board)
						.append(" does not contain position ").append(givenPositionThatIsOutsideTheBoard)
						.toString() , actualContains);
		}
	}
	
	public static class WhenIsMarked extends GivenNonEmptyBoard {
		
		public void testGivenPositionIsAlreadyOccupied_ThenReturnTrue() {
			Position givenPositionThatIsAlreadyOccupied = new Position(1, 1);
			
			boolean actualMarked = board.isMarked(givenPositionThatIsAlreadyOccupied);
			
			assertTrue(new StringBuilder()
						.append("Should have been TRUE because board ").append(board)
						.append(" is already marked at position ").append(givenPositionThatIsAlreadyOccupied)
						.toString() , actualMarked);
		}
		
		public void testGivenPositionIsNotYetOccupied_ThenReturnFalse() {
			Position givenPositionThatIsNotYetOccupied = new Position(1, 2);
			
			boolean actualMarked = board.isMarked(givenPositionThatIsNotYetOccupied);
			
			assertFalse(new StringBuilder()
						.append("Should have been FALSE because board ").append(board)
						.append(" is NOT yet marked at position ").append(givenPositionThatIsNotYetOccupied)
						.toString() , actualMarked);
		}
	}
	
	public static class WhenGetRow extends GivenNonEmptyBoard {
		
		public void testShouldReturnMarksInTheBoardWithTheSameRow() {
			Line row = board.getRow(new Position(2, 3));
			
			assertEquals("Should have returned the marks with all the rows equal to 2.", 
					new Line(new MarkedPosition[]{new MarkedPosition(2, 1, Mark.NONE), new MarkedPosition(2, 2, Mark.NONE), new MarkedPosition(2, 3, Mark.NONE)}), row);
		}
	}
}
