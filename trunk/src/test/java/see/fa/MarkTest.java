package see.fa;

import junit.framework.TestCase;

import org.apache.commons.lang.builder.HashCodeBuilder;

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
		
		assertTrue("2D Mark array with same elements should have been equal.", are2DMarkArrayEquals);
	}

	public void testGivenNonEqualMarkArrays_WhenEquals_ThenFalse() {
		Mark[] lhs = {Mark.X, Mark.O, Mark.NONE};
		Mark[] rhs = {Mark.X, Mark.O, Mark.X};
		
		boolean areMarkArrayEquals = Mark.equals(lhs, rhs);
		
		assertFalse("Mark array with different elements should NOT have been equal.", areMarkArrayEquals);
	}
	
	public void testGivenNon2DEqualMarkArrays_WhenEquals_ThenFalse() {
		Mark[][] lhs = {{Mark.X}, {Mark.O}, {Mark.NONE}};
		Mark[][] rhs = {{Mark.X}, {Mark.O}, {Mark.X}};
		
		boolean are2DMarkArrayEquals = Mark.equals(lhs, rhs);
		
		assertFalse("2D Mark array with different elements should NOT have been equal.", are2DMarkArrayEquals);
	}
	
	public void testHashCodeShouldUseAllMarksToGenerateHashCode() {
		Mark[][] marks = {{Mark.X}, {Mark.O}, {Mark.NONE}};
		
		int hashCode = Mark.hashCode(marks);
		
		assertEquals("Should have used all mark elements for the hash code.", new HashCodeBuilder().append(marks).toHashCode(), hashCode);
	}

	public void testToStringShouldUseAllMarksToGenerateToString() {
		Mark[] marks = {Mark.X, Mark.O, Mark.NONE};
		
		String toString = Mark.toString(marks);
		
		assertEquals("Should have used all mark elements for the hash code.", "\nX O _\n" , toString);
	}
	
	public void testToStringShouldUseAllMarksOf2DMarkArrayToGenerateToString() {
		Mark[][] marks = {{Mark.X, Mark.O, Mark.NONE}};
		
		String toString = Mark.toString(marks);
		
		assertEquals("Should have used all mark elements for the hash code.", "\nX O _\n" , toString);
	}

}
