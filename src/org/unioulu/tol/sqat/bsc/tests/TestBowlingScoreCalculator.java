package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

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
}
