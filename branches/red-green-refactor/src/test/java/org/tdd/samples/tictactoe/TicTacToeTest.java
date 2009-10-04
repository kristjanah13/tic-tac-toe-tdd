package org.tdd.samples.tictactoe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TicTacToeTest extends TestSuite {
	
	public static Test suite() {
		TestSuite allTests = new TestSuite();
		allTests.addTestSuite(GivenNewGame_WhenMove.class);
		allTests.addTestSuite(GivenRunningGame_WhenMove.class);
		allTests.addTestSuite(GivenRunningGame_AndLastMoveIsXMark_WhenMove.class);
		allTests.addTestSuite(GivenRunningGame_AndLastMoveIsOMark_WhenMove.class);
		allTests.addTestSuite(GivenEndGame_WhenMove.class);
		return allTests;
	}

	public static class AbstractTicTacToeTest extends TestCase {
		protected TicTacToe ticTacToe;

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
	}
	
	public static class GivenNewGame_WhenMove extends AbstractTicTacToeTest {
		public void testGivenAMarkedPosition_ThenMarkPositionOnBoard() {
			
		}
		
		public void test_ThenDoThrowGameOverException() {
			
		}
	}
	
	public abstract static class AbstractGivenRunningGame_WhenMove extends AbstractTicTacToeTest {
		
	}

	public static class GivenRunningGame_WhenMove extends AbstractGivenRunningGame_WhenMove {
		public void testGivenAMarkedPositionThatIsNotYetOccupied_ThenDotNotThrowIllegalMoveException() {
			
		}

		public void testGivenAMarkedPositionThatIsAlreadyOccupied_ThenThrowIllegalMoveException() {
			
		}
		
		public void testGivenAMarkedPositionWithinTheBoard_WhenMove_ThenDoNotThrowIllegalMoveException() {
			
		}
		
		public void test_ThenDoThrowGameOverException() {
			
		}
		
		public void testGivenMarkedPositionWhichMakesAHorizontalLine_ThenWin() {
			
		}
		
		public void testGivenMarkedPositionWhichMakesAVerticalLine_ThenWin() {
			
		}
		
		public void testGivenMarkedPositionWhichMakesAnUpperLeftToLowerRightDiagonalLine_ThenWin() {
			
		}
		
		public void testGivenMarkedPositionWhichMakesAnUpperRightToLowerLeftDiagonalLine_ThenWin() {
			
		}
		
		public void testGivenMarkedPositionWhichMakesNoStraightLine_ThenContinueGame() {
			
		}
	}

	public static class GivenRunningGame_AndLastMoveIsXMark_WhenMove extends AbstractGivenRunningGame_WhenMove {
		public void testGivenAnXMark_ThenThrowIllegalMoveException() {
			
		}
		
		public void testGivenAnOMark_ThenDoNotThrowIllegalMoveException() {
			
		}
	}
	
	public static class GivenRunningGame_AndLastMoveIsOMark_WhenMove extends AbstractGivenRunningGame_WhenMove {
		public void testGivenAnXMark_ThenDoNotThrowIllegalMoveException() {
			
		}
		
		public void testGivenAnOMark_ThenThrowIllegalMoveException() {
			
		}
	}
	
	public static class GivenEndGame_WhenMove extends AbstractTicTacToeTest {
		public void test_ThenThrowGameOverException() {
			
		}
	}
	
}
