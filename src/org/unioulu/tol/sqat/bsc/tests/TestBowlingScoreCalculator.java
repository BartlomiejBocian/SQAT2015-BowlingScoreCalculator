package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testTheScoreOfSixandFourGaveSpare(){
		Frame frame = new Frame(6,4);
		
		boolean spare = frame.isSpare();
		
		assertEquals(true, spare);
	}
}
