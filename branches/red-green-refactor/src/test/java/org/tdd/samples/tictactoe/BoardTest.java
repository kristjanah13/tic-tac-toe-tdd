package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BoardTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		allTests.addTestSuite(WhenSet.class);
		allTests.addTestSuite(WhenContains.class);
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
	
	public static class WhenContains extends AbstractBoardTest {
		
		@Override
		protected void setUp() throws Exception {
			super.setUp();
			board = new Board(new Mark[][]{
					{Mark.X, Mark.NONE, Mark.NONE}, 
					{Mark.NONE, Mark.NONE, Mark.NONE}, 
					{Mark.NONE, Mark.NONE, Mark.NONE}
			});
		}

		public void testGivenPositionIsAlreadyOccupied_ThenReturnTrue() {
			Position givenPositionThatIsAlreadyOccupied = new Position(1, 1);
			
			boolean actualContains = board.contains(givenPositionThatIsAlreadyOccupied);
			
			assertTrue(new StringBuilder()
						.append("Should have been TRUE because board ").append(board)
						.append(" already contains position ").append(givenPositionThatIsAlreadyOccupied)
						.toString() , actualContains);
		}
		
		public void testGivenPositionIsNotYetOccupied_ThenReturnFalse() {
			Position givenPositionThatIsNotYetOccupied = new Position(1, 2);
			
			boolean actualContains = board.contains(givenPositionThatIsNotYetOccupied);
			
			assertFalse(new StringBuilder()
						.append("Should have been FALSE because board ").append(board)
						.append(" does not contain position ").append(givenPositionThatIsNotYetOccupied)
						.toString() , actualContains);
		}
	}
}
