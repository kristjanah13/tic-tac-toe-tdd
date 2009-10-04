package org.tdd.samples.tictactoe;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	
	private Board board;
	
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

	public void testGivenMarkedPosition_WhenSet_ThenUpdateBoard() {
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
	
	public void testGivenPositionIsAlreadyOccupied_WhenContains_ThenReturnTrue() {
		
	}
	
	public void testGivenPositionIsNoetOccupied_WhenContains_ThenReturnFalse() {
		
	}
}
