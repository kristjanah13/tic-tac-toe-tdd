package see.fa;

import junit.framework.TestCase;

public class MarkTest extends TestCase {
	
	public void testGivenEqualMarkArrays_WhenEquals_ThenTrue() {
		Mark[] lhs = {Mark.X, Mark.O, Mark.NONE};
		Mark[] rhs = {Mark.X, Mark.O, Mark.NONE};
		
		boolean areMarkArrayEquals = Mark.equals(lhs, rhs);
		
		assertTrue("Mark array with same elements should have been equal.", areMarkArrayEquals);
	}
	
	public void testGivenEqual2DMarkArrays_WhenEquals_ThenTrue() {
		Mark[][] lhs = {{Mark.X}, {Mark.O}, {Mark.NONE}};
		Mark[][] rhs = {{Mark.X}, {Mark.O}, {Mark.NONE}};
		
		boolean are2DMarkArrayEquals = Mark.equals(lhs, rhs);
		
		assertTrue("Mark array with same elements should have been equal.", are2DMarkArrayEquals);
	}

	public void testGivenNonEqualMarkArrays_WhenEquals_ThenFalse() {
		
	}
	
	public void testHashCodeShouldUseAllMarksToGenerateHashCode() {
	
	}

	public void testToStringShouldUseAllMarksToGenerateToString() {
		
	}

}
