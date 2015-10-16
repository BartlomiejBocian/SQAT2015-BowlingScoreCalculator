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
	
	//Bowling Game Test
	@Test
	public void testBowlingGameAddFrameToEmptyGame(){
		Frame frame = new Frame(1,2);
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.addFrame(frame);
		int frameInGame = bowlingGame.getFrames().size();
		assertEquals(1, frameInGame);
	}
	
	
}
