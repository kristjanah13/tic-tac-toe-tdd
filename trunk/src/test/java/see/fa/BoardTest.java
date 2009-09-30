package see.fa;

import junit.framework.TestCase;

public class BoardTest extends TestCase {

	public void testGivenAPosition_WhenGetRow_ThenReturnRowContainingTheMarksOfThatRow() {
		Board board = new Board(
			new Mark[][]{
					{Mark.X,       Mark.O,      Mark.NONE}, 
					{Mark.NONE, Mark.X,      Mark.O},
					{Mark.O,      Mark.NONE, Mark.X}
			}
		);
		
		Line rowAtPosition = board.getRow(new Position(1,1));
		
		assertEquals("Should have retrieved 1st row.", new Line(Mark.X, Mark.O, Mark.NONE), rowAtPosition);
	}
}
