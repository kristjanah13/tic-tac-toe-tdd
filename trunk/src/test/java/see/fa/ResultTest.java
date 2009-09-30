package see.fa;

import junit.framework.TestCase;

public class ResultTest extends TestCase {

	public void testGivenNullRow_WhenValueOf_ThenReturnGameNotFinish() {
		Row givenNullRow = null;
		
		Result result = Result.valueOf(givenNullRow);
		
		assertEquals("Game should not have been finished yet based on the row.", Result.GAME_NOT_FINISH, result);
	}
	
	public void testGivenAllXRows_WhenValueOf_ThenReturnXWins() {
		Row givenAllXRows = new Row(Mark.X, Mark.X, Mark.X);
		
		Result result = Result.valueOf(givenAllXRows);
		
		assertEquals("X should have won.", Result.X_WINS, result);
	}
	
	public void testGivenAllORows_WhenValueOf_ThenReturnOWins() {
		Row givenAllXRows = new Row(Mark.O, Mark.O, Mark.O);
		
		Result result = Result.valueOf(givenAllXRows);
		
		assertEquals("O should have won.", Result.O_WINS, result);
	}
	
	public void testGivenContainsANoneMark_WhenValueOf_ThenReturnGameNotFinish() {
		Row givenAllXRows = new Row(Mark.NONE, Mark.NONE, Mark.NONE);
		
		Result result = Result.valueOf(givenAllXRows);
		
		assertEquals("Game should not have been finished yet.", Result.GAME_NOT_FINISH, result);
	}
}
