package see.fa;

import junit.framework.TestCase;

public class ResultTest extends TestCase {

	public void testGivenNullRow_WhenValueOf_ThenReturnNull() {
		Row givenNullRow = null;
		
		Result result = Result.valueOf(givenNullRow);
		
		assertEquals("Game should not have been finished yet based on the row.", Result.GAME_NOT_FINISH, result);
	}
}
