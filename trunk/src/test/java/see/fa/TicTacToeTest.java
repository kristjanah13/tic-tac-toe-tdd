package see.fa;

import junit.framework.TestCase;

public class TicTacToeTest extends TestCase {
	
	private TicTacToe ticTacToe;
	
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

	public void testGivenPosition_AndMark_WhenMove_ThenMarkPosition() {
		
	}

	public void testGivenPosition_AndMark_AndTwoSameMarksInHorizontalLine_WhenMove_ThenWinGameForMark() {
		
	}
	
	public void testGivenPosition_AndMark_AndTwoSameMarksInHorizontalLine_WhenMove_ThenLoseGameForOtherMark() {
		
	}

	public void testGivenPosition_AndMark_AndTwoSameMarksInVerticalLine_WhenMove_ThenWinGameForMark() {
		
	}
	
	public void testGivenPosition_AndMark_AndTwoSameMarksInVerticalLine_WhenMove_ThenLoseGameForOtherMark() {
		
	}
	
	public void testGivenPosition_AndMark_AndTwoSameMarksInDiagonalLine_WhenMove_ThenWinGameForMark() {
		
	}
	
	public void testGivenPosition_AndMark_AndTwoSameMarksInDiagonalLine_WhenMove_ThenLoseGameForOtherMark() {
		
	}
	
	public void testGivenPosition_AndMark_AndNoSameMarksOnAnyStraightLine_WhenMove_ThenContinueGame() {
		
	}
}
