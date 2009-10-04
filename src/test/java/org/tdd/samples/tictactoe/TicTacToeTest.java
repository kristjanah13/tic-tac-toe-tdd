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
			MarkedPosition givenMarkedPosition = new MarkedPosition(1, 1, Mark.X);
			
			ticTacToe.move(givenMarkedPosition);
			
			Board board = ticTacToe.getBoard();
			assertEquals("Should have marked board.",
					new Board(new Mark[][]{
							{Mark.X, Mark.NONE, Mark.NONE},
							{Mark.NONE, Mark.NONE, Mark.NONE},
							{Mark.NONE, Mark.NONE, Mark.NONE}
					}), 
					board
			);
		}
		
		public void test_ThenDoThrowGameOverException() {
			MarkedPosition givenAnyMarkedPosition = new MarkedPosition(1, 1, Mark.X);
			
			try {
				ticTacToe.move(givenAnyMarkedPosition);
			} catch(GameOverException e) {
				fail("Should not have thrown a " + e.getClass().getName() + "  when ");
			}
		}
	}
	
	public abstract static class AbstractGivenRunningGame_WhenMove extends AbstractTicTacToeTest {

		protected Mark nextMark;
		
		@Override
		protected void setUp() throws Exception {
			super.setUp();
			
			ticTacToe.move(new MarkedPosition(2, 2, Mark.X));
			nextMark = Mark.O;
		}

		@Override
		protected void tearDown() throws Exception {
			nextMark = null;
			super.tearDown();
		}
		
	}

	public static class GivenRunningGame_WhenMove extends AbstractGivenRunningGame_WhenMove {
		public void testGivenAMarkedPositionThatIsNotYetOccupied_ThenDotNotThrowIllegalMoveException() {
			MarkedPosition givenMarkedPositionThatIsNotYetOccupied = new MarkedPosition(3, 3, nextMark);
			
			try {
				ticTacToe.move(givenMarkedPositionThatIsNotYetOccupied);
			} catch (IllegalMoveException illegalMoveException) {
				fail("Should NOT have thrown an " + illegalMoveException);
			}
		}

		public void testGivenAMarkedPositionThatIsAlreadyOccupied_ThenThrowIllegalMoveException() {
			MarkedPosition givenMarkedPositionThatIsAlreadyOccupied = new MarkedPosition(2, 2, nextMark);
			
			try {
				ticTacToe.move(givenMarkedPositionThatIsAlreadyOccupied);
				fail("Should have thrown an " + IllegalMoveException.class.getName());
			} catch (IllegalMoveException illegalMoveException) {
				
			}
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
