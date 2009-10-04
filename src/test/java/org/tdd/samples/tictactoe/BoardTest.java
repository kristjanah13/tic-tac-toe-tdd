package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BoardTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		return allTests;
	}
	
	public static class AbstractBoardTest extends TestCase {
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
		public void testGivenPositionIsAlreadyOccupied_ThenReturnTrue() {
			
		}
		
		public void testGivenPositionIsNotYetOccupied_ThenReturnFalse() {
			
		}
	}
}
