package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	//Frame Game Test
	@Test
	public void testFrameScoreCalculaitingFourAndFifeGaveNine(){
		Frame frame = new Frame(4,5);
		int frameScore = frame.score();
		assertEquals(9, frameScore);
	}
	
	@Test
	public void testFrameScoreCalculaitingSevenAndOneGaveEight(){
		Frame frame = new Frame(7,1);
		int frameScore = frame.score();
		assertEquals(8, frameScore);
	}
	
	@Test
	public void testFrameOfSixandFourGaveSpare(){
		Frame frame = new Frame(6,4);
		boolean spare = frame.isSpare();
		assertEquals(true, spare);
	}
	
	@Test
	public void testFrameOfOneAndFourGaveSpare(){
		Frame frame = new Frame(1,4);
		boolean spare = frame.isSpare();	
		assertEquals(false, spare);
	}
	
	@Test
	public void testFrameGetWhenTenOnFirtsThrowStrike(){
		Frame frame = new Frame(10,4);
		boolean strike = frame.isStrike();	
		assertEquals(true, strike);
	}
	
	@Test
	public void testFrameGetNoStrike(){
		Frame frame = new Frame(1,4);
		boolean strike = frame.isStrike();	
		assertEquals(false, strike);
	}
	
	@Test
	public void testFrameScoreWhenStrike(){
		Frame frame = new Frame(10,4);
		int frameScore = frame.score();
		assertEquals(10, frameScore);
	}
	
	//Bowling Game Test
	@Test
	public void testGameAddFrameToEmptyGame(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(new Frame(1,2));
		int frameInGame = bowlingGame.getFrames().size();
		assertEquals(1, frameInGame);
	}
	
	@Test
	public void testGameFromTwoFramesWithoutStrikeOrSpare(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame( new Frame(1,2));
		bowlingGame.addFrame(new Frame(3,2));
		int scoreOfTheGame = bowlingGame.score();
		assertEquals(8, scoreOfTheGame);
	}
	
	@Test
	public void testGameScoreFromThreeFramesWithoutStrikeOrSpare(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(new Frame(1,2));
		bowlingGame.addFrame(new Frame(3,2));
		bowlingGame.addFrame(new Frame(3,3));
		int scoreOfTheGame = bowlingGame.score();
		assertEquals(14, scoreOfTheGame);
	}
	
	@Test
	public void testGameScoreFromThreeFramesWithSpare(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(new Frame(1,2));
		bowlingGame.addFrame(new Frame(9,1));
		bowlingGame.addFrame(new Frame(3,3));
		int scoreOfTheGame = bowlingGame.score();
		assertEquals(22, scoreOfTheGame);
	}
	
	@Test
	public void testGameScoreFromThreeFramesWithStrike(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(new Frame(1,2));
		bowlingGame.addFrame(new Frame(10,9));
		bowlingGame.addFrame(new Frame(3,3));
		int scoreOfTheGame = bowlingGame.score();
		assertEquals(25, scoreOfTheGame);
	}
	
	@Test
	public void testGameLastFrameWithOutBonusOrStrikeAndSpare(){
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		bowlingGame.addFrame(new Frame(1,1));
		int scoreOfTheGame = bowlingGame.score();
		assertEquals(20, scoreOfTheGame);
	}
}
