package see.fa;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	
	private Board board;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		board = new Board(
				new Mark[][]{
						{Mark.X,       Mark.O,      Mark.NONE}, 
						{Mark.NONE, Mark.X,      Mark.O},
						{Mark.O,      Mark.NONE, Mark.X}
				}
			);
	}

	@Override
	protected void tearDown() throws Exception {
		board = null;
		super.tearDown();
	}

	public void testGivenAPosition_WhenGetRow_ThenReturnRowContainingTheMarksOfThatRow() {
		Line rowAtPosition = board.getRow(new Position(1,1));
		
		assertEquals("Should have retrieved 1st row.", new Line(Mark.X, Mark.O, Mark.NONE), rowAtPosition);
	}
	
	public void testGivenAPosition_WhenGetCol_ThenReturnColContainingTheMarksOfThatCol() {
		Line colAtPosition = board.getCol(new Position(1,1));
		
		assertEquals("Should have retrieved 1st col.", new Line(Mark.X, Mark.NONE, Mark.O), colAtPosition);
	}
}
