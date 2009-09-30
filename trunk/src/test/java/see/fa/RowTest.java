package see.fa;

import junit.framework.TestCase;

public class RowTest extends TestCase {
	
	public void testGivenAllContainedMarksAreEqualInputMark_WhenAreAll_ThenTrue() {
		boolean areAllMarkedAsSuch = new Row(Mark.X, Mark.X, Mark.X).areAll(Mark.X);
		
		assertTrue("Should have been marked all as the given mark.", areAllMarkedAsSuch);
	}
	
	public void testGivenContainsAMarkNotEqualToInputMark_WhenAreAll_ThenFalse() {
		boolean areAllMarkedAsSuch = new Row(Mark.NONE, Mark.X, Mark.X).areAll(Mark.X);
		
		assertFalse("Should NOT have been marked all as the given mark.", areAllMarkedAsSuch);
	}

}
