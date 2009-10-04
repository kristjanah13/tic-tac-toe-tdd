package org.tdd.samples.tictactoe;

import junit.framework.TestCase;

public class TicTacToeTest extends TestCase {

	private TicTacToe ticTacToe

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ticTacToe = new TicTacToe();
	}

	@Override
	protected void tearDown() throws Exception {
		ticTacToe = null;
		super.tearDown();
	}
	
	public void testGivenAMark_AndAPositionThatIsNotOccupied_WhenMove_ThenMarkPositionOnBoard() {
		
	}

	public void testGivenAMark_AndAPositionThatIsOccupied_WhenMove_ThenMarkPositionOnBoard() {
		
	}
	
	public void testGivenAnXMark_AndNoPreviousMove_WhenMove_ThenDoNotThrowIllegalMoveException() {
		
	}
	
	public void testGivenAnXMark_AndPreviousMoveIsOMark_WhenMove_ThenDoNotThrowIllegalMoveException() {
		
	}
	
	public void testGivenAnXMark_AndPreviousMoveIsXMark_WhenMove_ThenThrowIllegalMoveException() {
		
	}
	
	public void testGivenAnOMark_AndNoPreviousMove_WhenMove_ThenDoNotThrowIllegalMoveException() {
		
	}
	
	public void testGivenAnOMark_AndPreviousMoveIsXMark_WhenMove_ThenDoNotThrowIllegalMoveException() {
		
	}
	
	public void testGivenAnOMark_AndPreviousMoveIsOMark_WhenMove_ThenThrowIllegalMoveException() {
		
	}
	
	public void testGivenMarkedPositionWhichMakesAHorizontalLine_WhenMove_ThenWin() {
		
	}
	
	public void testGivenMarkedPositionWhichMakesAVerticalLine_WhenMove_ThenWin() {
		
	}
	
	public void testGivenMarkedPositionWhichMakesAnUpperLeftToLowerRightDiagonalLine_WhenMove_ThenWin() {
		
	}
	
	public void testGivenMarkedPositionWhichMakesAnUpperRightToLowerLeftDiagonalLine_WhenMove_ThenWin() {
		
	}
	
	public void testGivenMarkedPositionWhichMakesNoStraightLine_WhenMove_ThenContinueGame() {
		
	}
	
	public void testGivenMarkedPositionWhileGameHasEnded_WhenMove_ThenThrowGameOverException() {
		
	}
	
}
